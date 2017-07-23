package org.fkit.service;

import java.util.List;

import org.fkit.domain.Good;
import org.fkit.service.impl.GoodServiceImpl;
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

public class GoodServiceTest {
	@Autowired
    private GoodService goodService;

	@Test
	public void testGetAll4() {
		List<Good> u = goodService.getAll4(1);
        System.out.println(u);
       
	}

}
