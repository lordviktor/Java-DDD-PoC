package br.com.victor.JavaDddExample.repository.interfaces.base;

import java.util.List;

import br.com.victor.JavaDddExample.domain.base.AbstractEntity;

public interface CrudRepository<T extends AbstractEntity> {
	void save(T data);
	void update(T data);
	void delete(T data);
	List<T> list();
}
