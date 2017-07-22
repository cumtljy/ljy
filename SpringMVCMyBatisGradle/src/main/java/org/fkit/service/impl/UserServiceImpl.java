package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Cart;
import org.fkit.domain.User;
import org.fkit.mapper.UserMapper;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
	
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;

	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public User login(String username, String password) {
		return userMapper.findWithUsernameAndPassword(username, password);
	}
//	@Override
//	public User protect(String username,  String email, String phone) {
//		// TODO Auto-generated method stub
//		return userMapper.findPassword(username,email,  phone);
//	}

	@Override
	public User find(String username, String email) {
		return userMapper.findPassword(username,email);
	}

   @Override
	public User update(String username, String password,String email,String phone,String address) {
		return userMapper.update(username,password,email,phone,address);
	}
   @Override
	public List<User> getAll(String username) {
		
		return userMapper.findAll (username);
	}
}
