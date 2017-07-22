package org.fkit.controller;

import java.util.List;

import org.fkit.domain.Detail;
import org.fkit.domain.Order;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * 处理图书请求控制器
 * */
@Controller
public class OrderController {
	
	/**
	 * 自动注入BookService
	 * */
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;

	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/order")
	 public String order(Model model,
			 String username){
		// 获得所有图书集合
		List<Order> order_list = orderService.getAll(username);
		// 将图书集合添加到model当中
		model.addAttribute("order_list", order_list);
		// 跳转到main页面
		return "order";
	}
	
	@RequestMapping(value="/detail")
	 public String detail(Model model,
			 int id){
		// 获得所有图书集合
		List<Detail> detail_list = orderService.getAll1(id);
		// 将图书集合添加到model当中
		model.addAttribute("detail_list", detail_list);
		// 跳转到main页面
		return "detail";
	}

//	@RequestMapping(value="/submitorder")
//	 public ModelAndView submitOD(
//			    
//			    String username,
//				Double totalprice, 
//				String phone, 
//				String address,
//				String status,
//
//				int goodid,
//				Double price,
//				int quantity,
//			   ModelAndView mv ){
//		Order insertorder = orderService.insertorder(username, totalprice,phone,address,status,);
//		
//		mv.setViewName("ordersuccess");
//		return mv;
//	}
	
	@RequestMapping(value="/submitorder",method=RequestMethod.POST)
	 public ModelAndView submitorder(
			    String username,
				Double totalprice, 
				String phone, 
				String address,
				String status,
				int goodid,
				Double price,
			    int quantity,
			   ModelAndView mv ){
		Order insertorder = orderService.insertorder(username, totalprice,phone,address,status,goodid,price,quantity);
		mv.setViewName("ordersuccess");
		return mv;
	}
}
