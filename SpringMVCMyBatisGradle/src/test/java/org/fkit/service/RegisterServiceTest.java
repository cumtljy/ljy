package org.fkit.service;

import static org.junit.Assert.*;

import org.fkit.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springmvc-config.xml"})
public class RegisterServiceTest {

	@Autowired 
	@Qualifier("registerService")
	 private RegisterService registerService;

	@Test
	public void testRegister() {
		User insertuser = registerService.register
				("mm", "78945","123","133@163.com","13374");
				
		System.out.println("注册成功");
	
	}
}
