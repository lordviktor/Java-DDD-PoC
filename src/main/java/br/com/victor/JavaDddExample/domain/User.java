package br.com.victor.JavaDddExample.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import br.com.victor.JavaDddExample.domain.base.Entity;
import br.com.victor.JavaDddExample.repository.interfaces.IUserRepository;

@Configurable
public class User extends Entity {
	
	public String Name;
	
	@Autowired(required=true)
	private IUserRepository userRepository;
	
	public void Save()
	{
		userRepository.save(this);
	}
	
	
}
