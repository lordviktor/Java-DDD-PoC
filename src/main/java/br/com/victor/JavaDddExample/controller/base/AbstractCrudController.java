package br.com.victor.JavaDddExample.controller.base;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.victor.JavaDddExample.domain.base.AbstractTenancyEntity;

public class AbstractCrudController<T extends AbstractTenancyEntity> {

	protected Class<T> entityClass;
	private JpaRepository<T, Long> repository;

	public AbstractCrudController(Class<T> entity,
			JpaRepository<T, Long> repository) {
		this.entityClass = entity;
		this.repository = repository;
	}

//	@RequestMapping(method = RequestMethod.GET)
//	public List<E> list() {
//		
//	}

}
