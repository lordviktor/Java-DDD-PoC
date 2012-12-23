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

	@Autowired
	private App beanTest;
	
	@Autowired
	private IUserRepository userRepo;
	
	@Test
	public void TestBeanInjection()
	{
		assertNotNull(beanTest);
		assertNotNull(userRepo);

		User var = new User();
		var.Save();
	}
}
