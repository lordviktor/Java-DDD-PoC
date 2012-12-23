package br.com.victor.JavaDddExample.repository.interfaces.base;

import java.util.List;

import br.com.victor.JavaDddExample.domain.base.Entity;

public interface CrudRepository<T extends Entity> {
	void save(final T data);
	void update(final T data);
	void delete(final T data);
	List<T> list();
}
