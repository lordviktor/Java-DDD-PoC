package br.com.victor.JavaDddExample.resources.builder.base;

import br.com.victor.JavaDddExample.domain.base.AbstractEntity;
import br.com.victor.JavaDddExample.resources.base.AbstractResource;

public class AbstractEntityBuilder<T extends AbstractResource, E extends AbstractEntity> {

	public AbstractEntityBuilder(Class<T> resourceClass, Class<E> entityClass) {

	}

}
