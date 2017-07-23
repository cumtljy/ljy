package org.fkit.controller;

import java.util.List;

import org.fkit.domain.User;
import org.fkit.service.UserService;
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

public class UserControllerTest {
	@Autowired 
	@Qualifier("userService")
	 private UserService UserService;
	@Test
	public void testLogin() {
		User u=UserService.login("静玉", "123");
		if(u!= null){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
	
	}
	@Test
	public void testupdate() {
		User user = UserService.update
				("1","123456", "132@123", "12345", "12345");
		System.out.println("修改成功");
	}
	
	

}

