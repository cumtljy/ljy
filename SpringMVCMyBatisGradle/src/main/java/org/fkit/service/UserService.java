package org.fkit.service;

import java.util.List;

import org.fkit.domain.Cart;
import org.fkit.domain.User;

/**
 * User服务层接口
 * */
public interface UserService {
	
	/**
	 * 判断用户登录
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	User login(String username,String password);
//	User protect(String username, String email, String phone);
	User update(String username, String password, String email, String phone,String address);
	User find(String username, String email);
	List<User> getAll(String username);
	
}
