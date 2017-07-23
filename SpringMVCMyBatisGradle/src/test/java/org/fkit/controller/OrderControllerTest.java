package org.fkit.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.Detail;
import org.fkit.domain.Order;
import org.fkit.service.CartService;
import org.fkit.service.OrderService;
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
public class OrderControllerTest {
	@Autowired
    private OrderService orderService;
	
	@Test
	public void testOrder() {
		List<Order> u = orderService.getAll("123");
		System.out.println(u);
	}
	@Test
	public void testDetail() {
		List<Detail> r = orderService.getAll1(2);
		System.out.println(r);
	}
	
}
