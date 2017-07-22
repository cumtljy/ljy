package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Collect;
import org.fkit.domain.Comment;
import org.fkit.domain.Order;
import org.fkit.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommentController {
	
	/**
	 * 自动注入BookService
	 * */
	@Autowired
	@Qualifier("commentService")
	private CommentService commentService;

	/**
	 * 处理/main请求
	 * */
	 @RequestMapping(value="/submitcomment",method=RequestMethod.POST)
	 public ModelAndView comment(			           
			 			int oid,
			 			String username,
						String service,
						String logistics, 
						String quality, 
						String comments,
						String image,
					   ModelAndView mv,
				     HttpSession session){
		 Comment comment  = commentService.comment(oid,username,service,logistics,quality,comments,image);
	     mv.setViewName("cartSuccess");
			return mv;
	
	 }
	 
	 @RequestMapping(value="/commentorder")
	 public String comment(Model model,
			 int id){
		// 获得所有图书集合
		List<Order> order_list = commentService.getAll1(id);
		// 将图书集合添加到model当中
		model.addAttribute("order_list", order_list);
		// 跳转到main页面
		return "commentorder";
	}
	
}
