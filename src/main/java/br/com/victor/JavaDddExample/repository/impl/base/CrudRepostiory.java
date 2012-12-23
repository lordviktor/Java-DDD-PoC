package br.com.victor.JavaDddExample.repository.impl.base;

import java.util.ArrayList;
import java.util.List;

import br.com.victor.JavaDddExample.domain.base.Entity;
import br.com.victor.JavaDddExample.repository.interfaces.base.CrudRepository;

public abstract class CrudRepostiory<T extends Entity> 
	implements CrudRepository<T> 
{
	
	private ArrayList<T> data;
	
	public CrudRepostiory()
	{
		data = new ArrayList<T>();
	}
	
	public void save(T data) {
		this.data.add(data);
	}

	public void update(T data) {
		this.data.add(data);
	}

	public void delete(T data) {
		this.data.remove(data);
	}

	public List<T> list() {
		return this.data;
	}
}
