package org.fkit.service;

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.Good;
import org.fkit.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springmvc-config.xml"})
public class UserServiceTest {
	@Autowired
    private UserService userService;
	
	@Test
	public void testFind() {
		User t=userService.find("2", "13270336096@163.com");
				System.out.println(t);
	}

	@Test
	public void testGetAll() {
		List<User> u = userService.getAll("2");
		
		System.out.println(u);
	}

}
