package org.fkit.controller;

import java.util.List;


import org.fkit.domain.Collect;
import org.fkit.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * 处理图书请求控制器
 * */
@Controller
public class CollectController {
	
	/**
	 * 自动注入BookService
	 * */
	@Autowired
	@Qualifier("collectService")
	private CollectService collectService;

	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/collect")
	 public String collection(Model model,
			 String username){
		// 获得所有图书集合
		List<Collect> collect_list = collectService.getAll(username);
		// 将图书集合添加到model当中
		model.addAttribute("collect_list", collect_list);
		// 跳转到main页面
		return "collect";
	}
	@RequestMapping(value="/newcollect")
	 public ModelAndView newcollect(
			    int goodid,
			    String good_name,
				Double price, 
				String image, 
				String username,
			   ModelAndView mv ){
		Collect mycollect = collectService.collectFind(username,goodid);
		if(mycollect != null){
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "该商品已收藏过!");
			mv.setViewName("collect");
			
		}else{
			// 登录成功，将user对象设置到HttpSession作用范围域
			collectService.newcollect(goodid,good_name, price,image,username);
			// 转发到main请求
		    mv.setViewName("cartSuccess");

		}
		return mv;
	}

	@RequestMapping(value="/deletecollect")
	 public ModelAndView deletecollect(int goodid, 
			 
			 ModelAndView mv ){
	    collectService.deletecollect(goodid);
		mv.setViewName("cartSuccess");
		return mv;
	}
}
