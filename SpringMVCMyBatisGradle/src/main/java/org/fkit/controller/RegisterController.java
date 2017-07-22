package org.fkit.controller;

import javax.servlet.http.HttpSession;

import org.fkit.domain.User;
import org.fkit.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@Autowired
	@Qualifier("registerService")
	private RegisterService registerService;

	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView register(
			String username,
			String password, 
			String email, 
			String phone, 
			String address,
			 ModelAndView mv,
			 HttpSession session){
		User register = registerService.register
				(username, password,
				email,phone,address);
		mv.setViewName("registerSuccess");
		return mv;
	}
}
