package br.com.victor.JavaDddExample.repository.impl.base;

import java.util.ArrayList;
import java.util.List;

import br.com.victor.JavaDddExample.domain.base.AbstractEntity;
import br.com.victor.JavaDddExample.repository.interfaces.base.CrudRepository;

public abstract class AbstractCrudRepostiory<T extends AbstractEntity> 
	implements CrudRepository<T> 
{
	private final List<T> data;
	
	public AbstractCrudRepostiory()
	{
		data = new ArrayList<T>();
	}
	
	public void save(final T data) {
		this.data.add(data);
	}

	public void update(final T data) {
		this.data.add(data);
	}

	public void delete(final T data) {
		this.data.remove(data);
	}

	public List<T> list() {
		return this.data;
	}
}
