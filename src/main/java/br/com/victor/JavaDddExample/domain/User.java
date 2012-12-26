package br.com.victor.JavaDddExample.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import br.com.victor.JavaDddExample.domain.base.AbstractEntity;
import br.com.victor.JavaDddExample.repository.interfaces.IUserRepository;

@Configurable()
public class User extends AbstractEntity {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Autowired
	private IUserRepository userRepository;

	public void save()
	{
		userRepository.save(this);
	}
}
