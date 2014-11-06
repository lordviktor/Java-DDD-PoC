package br.com.victor.JavaDddExample.resources.builder.base;

import br.com.victor.JavaDddExample.domain.Farmacia;
import br.com.victor.JavaDddExample.domain.base.AbstractTenancyEntity;
import br.com.victor.JavaDddExample.resources.DrugStore;
import br.com.victor.JavaDddExample.resources.base.AbstractTenancyResource;

public class AbstractTenancyEntityBuilder<Resource extends AbstractTenancyResource, Entity extends AbstractTenancyEntity>
		extends AbstractEntityBuilder<Resource, Entity> {

	public AbstractTenancyEntityBuilder(Class<Resource> resourceClass,
			Class<Entity> entityClass) {
		super(resourceClass, entityClass);
	}

	@Override
	public Resource toResource(Entity entity) {
		Resource resource = super.toResource(entity);

		DrugStore drugStore = new DrugStore();
		drugStore.setId(entity.getFarmacia().getId());
		resource.setDrugStore(drugStore);

		return resource;
	}

	public Entity toEntity(Resource resource, Farmacia farmacia) {
		Entity entity = super.toEntity(resource);

		entity.setFarmacia(farmacia);
		
		return entity;
	}

}
