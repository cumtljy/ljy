package org.fkit.controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Cart;

import org.fkit.service.CartService;
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
public class Cartcontroller {
	
	/**
	 * 自动注入ShopService
	 * */
	@Autowired
	@Qualifier("CartService")
	private CartService cartService;

	/**
	 * 处理/cart请求
	 * */
	@RequestMapping(value="/checkout")
	 public String cart(Model model,
			 String username){
		// 获得所有图书集合
		List<Cart> cart_list = cartService.getAll(username);
		// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到main页面
		return "checkout";
	}
	@RequestMapping(value="/newcart")
	 public ModelAndView newcart(
			    int goodid,
			    String good_name,
				Double price, 
				String image, 
				int quantity,				
				String username,
			   ModelAndView mv ){
		cartService.newcart(goodid,good_name, price,image,quantity,username);
		mv.setViewName("cartSuccess");
		return mv;
	}
	
	// 删除物品
		@RequestMapping(value="/deletecart")
		 public ModelAndView deletecart(int goodid, 
				 ModelAndView mv ){
		    cartService.deletecart(goodid);
			mv.setViewName("cartSuccess");
			return mv;
		}
		
		@RequestMapping(value="/updatecart",method=RequestMethod.POST)
		public ModelAndView updatecart(
		        int goodid,
				String username,
				int quantity,
				ModelAndView mv,
				HttpSession session){
			cartService.updatecart(goodid,username,quantity);
			mv.setViewName("cartSuccess");
			return mv;
		}
}
