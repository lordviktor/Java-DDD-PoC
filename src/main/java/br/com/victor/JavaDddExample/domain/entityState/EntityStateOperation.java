package br.com.victor.JavaDddExample.domain.entityState;

import br.com.victor.JavaDddExample.domain.base.AbstractEntity;
import br.com.victor.JavaDddExample.domain.base.EntityState;

public interface EntityStateOperation {
	
	EntityState deleted(AbstractEntity entity);
	
	EntityState modified(AbstractEntity entity);
}
