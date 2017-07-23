package org.fkit.service;

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.Cart;
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
public class CartServiceTest {

	@Autowired
    private CartService cartService;

	@Test
	public void testGetAll() {
		List<Cart> u=cartService.getAll("3");
		 System.out.println(u);
	}

//	@Test
//	public void testDeletecart() {
//		cartService.deletecart(16);
//		System.out.println("删除成功");
//	}

//	@Test
//	public void testUpdatecart() {
//		Cart cart = cartService.updatecart(18, "3", 4);
//		System.out.println("更新成功");
//	}

}
