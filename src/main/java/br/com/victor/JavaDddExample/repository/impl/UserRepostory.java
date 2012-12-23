package br.com.victor.JavaDddExample.repository.impl;

import org.springframework.stereotype.Component;

import br.com.victor.JavaDddExample.domain.User;
import br.com.victor.JavaDddExample.repository.impl.base.CrudRepostiory;
import br.com.victor.JavaDddExample.repository.interfaces.IUserRepository;

@Component
public class UserRepostory extends CrudRepostiory<User> implements IUserRepository {

	
}
