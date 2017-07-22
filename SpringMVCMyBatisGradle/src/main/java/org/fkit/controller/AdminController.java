package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.fkit.domain.Admin;
import org.fkit.domain.Good;
import org.fkit.domain.Order;
import org.fkit.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * 处理用户请求控制器
 * */
@Controller
public class AdminController {
	
	@Autowired
	@Qualifier("adminService")
	private AdminService adminService;

	@RequestMapping(value="/adminLogin" )
	 public ModelAndView adminlogin(
			 String adminname,
			 String adminpassword,
			 ModelAndView mv,
			 HttpSession session){
		// 根据登录名和密码查找用户，判断用户登录
		Admin admin = adminService.adminlogin(adminname, adminpassword);
		 if(admin != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("admin", admin);
			// 转发到main请求
			mv.setViewName("main");
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录失败，请重新输入!");
			mv.setViewName("adminLogin");
		}
		return mv;
	}
//	添加商品
	 @RequestMapping(value="/addproduct",method=RequestMethod.POST)
	 public ModelAndView addproduct(
				     String good_name,
				     Double price,				    
				     String image,
				     String image2,	
				     String image3,	
				     int stock, //库存
				     int sales,  //销量
				     int catagory_sn,
				  
					 ModelAndView mv,
				     HttpSession session){
	   Good addproduct  = adminService.addproduct (good_name,price,image,image2,image3,stock, sales,catagory_sn);
	     mv.setViewName("success");
			return mv;
	
	 }
//	 查看商品
	 @RequestMapping(value="/listproduct")
	 public String listproduct(Model model,
			 int id){
		// 获得所有图书集合
		List<Good> product_list = adminService.getAll2(id);
		// 将图书集合添加到model当中
		model.addAttribute("product_list",product_list);
		// 跳转到main页面
		return "updateproduct";
}
	 
	//  修改商品
		 @RequestMapping(value="/updateproduct",method=RequestMethod.POST)
			public ModelAndView updateproduct(
					 int id,
					 String good_name,
				     Double price,
				     int catagory_sn,

					ModelAndView mv,
					HttpSession session){		  
				Good updateproduct=	adminService.updateproduct(id,good_name,price,catagory_sn);
				mv.setViewName("success");
				return mv;
			}
//删除商品
		 @RequestMapping(value="/deleteproduct")
		 public ModelAndView deletecollect(int id, 
				 
				 ModelAndView mv ){
		    adminService.deleteproduct(id);
			mv.setViewName("success");
			return mv;
		}

//  查看订单
	 @RequestMapping(value="/lookorder")
	 public String lookorder(Model model){
		// 获得所有图书集合
		List<Order> order_list = adminService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("order_list", order_list);
		// 跳转到main页面
		return "lookorder";
	}
	//  修改订单
	 @RequestMapping(value="/updateorder",method=RequestMethod.POST)
		public ModelAndView updateorder(
		        int id,
				String status,
				Double totalprice, 
				String phone,
				String address,
				ModelAndView mv,
				HttpSession session){
			Order updateorder=	adminService.updateorder(id,status,totalprice, phone,address);
			mv.setViewName("success");
			return mv;
		}
//	 查看销量与库存
	 @RequestMapping(value="/newstock")
	 public String newstock(Model model){
		// 获得所有图书集合
		List<Good> newstock_list = adminService.getAll1();
		// 将图书集合添加到model当中
		model.addAttribute("newstock_list",newstock_list);
		// 跳转到main页面
		return "newstock";
}
//	 修改销量与库存
	 @RequestMapping(value="/updatestock",method=RequestMethod.POST)
		public ModelAndView updatestock(
		        int id,
				String good_name,
				int stock, 
				int sales,
				ModelAndView mv,
				HttpSession session){
			Good updatestock=adminService.updatestock(id,good_name,stock,sales);
			mv.setViewName("success");
			return mv;
		} 
}