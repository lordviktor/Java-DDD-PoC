package br.com.victor.JavaDddExample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.victor.JavaDddExample.domain.User;
import br.com.victor.JavaDddExample.repository.interfaces.IUserRepository;

import junit.framework.TestCase;

@ContextConfiguration(locations="classpath:application-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class Teste extends TestCase {
	
	private IUserRepository userRepository;
	
	@Autowired
	public void setUserRepository(final IUserRepository userRepository)
	{
		this.userRepository = userRepository;
	}
	
	@Test
	public void testBeanInjection()
	{
		assertNotNull("User repository cannot be null.", userRepository);
		final User user = new User();
		user.setName ("Viktor");
		user.save();
	}
}
