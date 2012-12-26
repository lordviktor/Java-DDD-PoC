package br.com.victor.JavaDddExample.domain.base;

import br.com.victor.JavaDddExample.domain.entityState.DeleteEntityStateOperation;
import br.com.victor.JavaDddExample.domain.entityState.EntityStateOperation;
import br.com.victor.JavaDddExample.domain.entityState.InsertEntityOperation;
import br.com.victor.JavaDddExample.domain.entityState.ModifyEntityStateOperation;

public enum EntityState implements EntityStateOperation {
	INSERTED(new InsertEntityOperation()),
	MODIFIED(new ModifyEntityStateOperation()),
	DELETED(new DeleteEntityStateOperation());

	protected EntityStateOperation currentOperation;
	
	EntityState(final EntityStateOperation operation)
	{
		currentOperation = operation;
	}
	
	public EntityState deleted(final AbstractEntity entity) {
		return currentOperation.deleted(entity);
	}

	public EntityState modified(final AbstractEntity entity) {
		return currentOperation.modified(entity);
	}
}
