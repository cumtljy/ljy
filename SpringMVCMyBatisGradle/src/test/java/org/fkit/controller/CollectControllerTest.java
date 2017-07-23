package org.fkit.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.Collect;
import org.fkit.service.CollectService;
import org.fkit.service.UserService;
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
public class CollectControllerTest {

	@Autowired 
	@Qualifier("collectService")
	 private CollectService collectService;
	@Test
	public void testCollection() {
		List<Collect> u = collectService.getAll("2");
		 System.out.println(u);
	}

	
	@Test
	public void testDeletecollect() {
		 collectService.deletecollect(13);
		 System.out.println("删除成功");
	}

}
