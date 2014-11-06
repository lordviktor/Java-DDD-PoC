package br.com.victor.JavaDddExample.controller.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.victor.JavaDddExample.domain.Farmacia;
import br.com.victor.JavaDddExample.domain.base.AbstractTenancyEntity;
import br.com.victor.JavaDddExample.repository.FarmaciaRepository;
import br.com.victor.JavaDddExample.resources.base.AbstractTenancyResource;
import br.com.victor.JavaDddExample.resources.builder.base.AbstractTenancyEntityBuilder;

public class AbstractCrudController<Entity extends AbstractTenancyEntity, Resource extends AbstractTenancyResource> {

	@Autowired
	protected FarmaciaRepository farmaciaRepostory;

	private JpaRepository<Entity, Long> repository;

	private AbstractTenancyEntityBuilder<Resource, Entity> builder;

	public AbstractCrudController(JpaRepository<Entity, Long> repository,
			AbstractTenancyEntityBuilder<Resource, Entity> builder) {
		this.repository = repository;
		this.builder = builder;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Resource> list() {
		List<Entity> allEntities = repository.findAll();

		List<Resource> result = new ArrayList<Resource>();

		for (Entity entity : allEntities) {
			result.add(builder.toResource(entity));
		}

		return result;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Resource get(@PathVariable("id") long id) {
		return builder.toResource(repository.getOne(id));
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Resource resource,
			@PathVariable("farmaciaId") long farmaciaId) {

		Farmacia farmacia = farmaciaRepostory.findOne(farmaciaId);
		
		Entity entity = builder.toEntity(resource, farmacia);
		repository.save(entity);
	}

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody Resource resource) {
		Entity entity = builder.toEntity(resource);
		repository.save(entity);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@RequestBody Resource resource) {
		repository.delete(resource.getId());
	}
}
