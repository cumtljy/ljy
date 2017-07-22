package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.fkit.domain.Cart;
import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */

	@RequestMapping(value="/login")
	 public ModelAndView login(
			 String username,String password,
			 ModelAndView mv,
			 HttpSession session){
		// 根据登录名和密码查找用户，判断用户登录
		
		User user = userService.login(username, password);
		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到main请求
			mv.setViewName("index");
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("login");
		}
		return mv;
	}
//	@RequestMapping(value="/find",method=RequestMethod.POST)
//	public ModelAndView find(String username,
//			String email,
//			String phone,
//		ModelAndView mv,
//		HttpSession session){
//		User user1=userService.protect(username, email,phone);
//		if(user1!=null){
//			session.setAttribute("user1", user1);
//			mv.setViewName("backPassword");
//		}
//		else{
//			mv.addObject("message","验证失败！");
//			mv.setViewName("find");
//		}
//		return mv;
//	}
	@RequestMapping(value="/findpw")
	public ModelAndView find(String username,String email,ModelAndView mv,HttpSession session, HttpServletResponse response) throws Exception{		
		User user=userService.find(username, email);
		if(user!=null){
			StringBuffer url=new StringBuffer();
			StringBuilder builder=new StringBuilder();
			builder.append("");
			url.append("您的密码是："+user.getPassword()+"");
			builder.append("");
			builder.append(""+url+"");
			
			System.out.print("builder输出");
			builder.append("");
			SimpleEmail sendemail=new SimpleEmail();
			sendemail.setHostName("smtp.163.com");
			sendemail.setAuthentication("18051369196@163.com","yx960801");
			sendemail.setCharset("UTF-8");
			try{
				sendemail.setCharset("UTF-8");
				sendemail.addTo(email);
				sendemail.setFrom("18051369196@163.com");
				sendemail.setSubject("找回密码");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				System.out.println(builder.toString());
			}catch(EmailException e){
				e.printStackTrace();
				System.out.print("抛出异常");
			}
			mv.setViewName("forget");
		
		}else{
			
			response.getWriter().println("密码获取失败");
			System.out.print("密码获取失败");
		}	
		return mv;
	}


	@RequestMapping(value="/update",method=RequestMethod.POST)
	public ModelAndView update(ModelAndView mv,
			String username,
			String password,
			String email,
			String phone,
			String address){
		User update=userService.update(username,password,email,phone,address);
		mv.setViewName("upsuccess");
		return mv;
	}
	@RequestMapping(value="/tell")
	public ModelAndView tell(String username,String email,ModelAndView mv,HttpSession session, HttpServletResponse response) throws Exception{		
		User user=userService.find(username, email);
		if(user!=null){
			StringBuffer url=new StringBuffer();
			StringBuilder builder=new StringBuilder();
			builder.append("");
			url.append("您的宝贝已发货，敬请期待");
			builder.append("");
			builder.append(""+url+"");
			
			System.out.print("builder输出");
			builder.append("");
			SimpleEmail sendemail=new SimpleEmail();
			sendemail.setHostName("smtp.163.com");
			sendemail.setAuthentication("18051369196@163.com","yx960801");
			sendemail.setCharset("UTF-8");
			try{
				sendemail.setCharset("UTF-8");
				sendemail.addTo(email);
				sendemail.setFrom("18051369196@163.com");
				sendemail.setSubject("订单通知");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				System.out.println(builder.toString());
			}catch(EmailException e){
				e.printStackTrace();
				System.out.print("抛出异常");
			}
			mv.setViewName("success");
		
		}else{
			
			response.getWriter().println("订单通知失败");
			System.out.print("订单通知失败");
		}	
		return mv;
	}

	@RequestMapping(value="/send")
	 public String cart(Model model,
			 String username){
		// 获得所有图书集合
		List<User> user_list = userService.getAll(username);
		// 将图书集合添加到model当中
		model.addAttribute("user_list", user_list);
		// 跳转到main页面
		return "send";
	}
//	@RequestMapping(value="/find")
//	public String backpwd(){
//		return "find";
		
	}
	

