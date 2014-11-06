package br.com.victor.JavaDddExample.resources.builder.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.victor.JavaDddExample.domain.base.AbstractEntity;
import br.com.victor.JavaDddExample.resources.base.AbstractResource;

public abstract class AbstractEntityBuilder<Resource extends AbstractResource, Entity extends AbstractEntity> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private Class<Resource> resourceClass;
	private Class<Entity> entityClass;

	public AbstractEntityBuilder(Class<Resource> resourceClass, Class<Entity> entityClass) {
		this.resourceClass = resourceClass;
		this.entityClass = entityClass;
	}

	public Resource toResource(Entity entity) {
		Resource result = getResourceInstance();
		result.setId(entity.getId());
		return result;
	}

	public Entity toEntity(Resource resource) {
		Entity result = getEntityInstance();
		result.setId(resource.getId());
		return result;
	}

	private Entity getEntityInstance() {
		Entity entity = null;

		try {
			entity = entityClass.newInstance();
		} catch (Exception e) {
			logger.error("A entidade {} nao possui um construtor default",
					entityClass.getName(), e);
		}

		return entity;
	}

	private Resource getResourceInstance() {
		Resource result = null;
		try {
			result = resourceClass.newInstance();
		} catch (Exception e) {
			logger.error("O recurso {} nao possui um construtor default",
					resourceClass.getName(), e);
		}
		return result;
	}

}
