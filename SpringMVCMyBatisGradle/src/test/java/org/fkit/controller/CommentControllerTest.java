package org.fkit.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.Order;
import org.fkit.service.CommentService;
import org.fkit.service.GoodService;
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

public class CommentControllerTest {
	@Autowired
    private CommentService commentService;
	

	@Test
	public void testCommentModelInt() {
		List<Order> u = commentService.getAll1(1);
		System.out.println(u);
		
	}

}
