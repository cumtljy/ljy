package org.fkit.controller;



import java.util.List;

import org.fkit.domain.Comment;
import org.fkit.domain.Good;

import org.fkit.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 处理图书请求控制器
 * */
@Controller
public class GoodController {
	
	/**
	 * 自动注入BookService
	 * */
	@Autowired
	@Qualifier("goodService")
	private GoodService goodService;

	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/mproduct")
	 public String collections(Model model){
		// 获得所有图书集合
		List<Good> good_list = goodService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("good_list", good_list);
		// 跳转到main页面
		return "mproduct";
	}
	@RequestMapping(value="/Men")
	 public String Men(Model model){
		// 获得所有图书集合
		List<Good> men_list = goodService.getAll1();
		// 将图书集合添加到model当中
		model.addAttribute("men_list", men_list);
		// 跳转到main页面
		return "Men";
	}
	@RequestMapping(value="/Women")
	 public String Women (Model model){
		// 获得所有图书集合
		List<Good> women_list = goodService.getAll2();
		// 将图书集合添加到model当中
		model.addAttribute("women_list", women_list);
		// 跳转到main页面
		return "Women";
	}
	@RequestMapping(value="/Gifts")
	 public String Gifts(Model model){
		// 获得所有图书集合
		List<Good> gifts_list = goodService.getAll3();
		// 将图书集合添加到model当中
		model.addAttribute("gifts_list", gifts_list);
		// 跳转到main页面
		return "Gifts";
	}
	@RequestMapping(value="/product")
	 public String look(int id,
			 Model model){
		// 获得所有图书集合
		List<Good> g_list = goodService.getAll4(id);
		List<Comment> comment_list = goodService.getAll5(id);
		// 将图书集合添加到model当中
		model.addAttribute("g_list", g_list);
		model.addAttribute("comment_list", comment_list);
		// 跳转到main页面
		return "product";
	}
	

}
