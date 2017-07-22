package org.fkit.service.impl;

import org.fkit.domain.User;

import org.fkit.mapper.RegisterMapper;
import org.fkit.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("registerService")
public class RegisterServiceImp implements RegisterService {
	@Autowired
	private RegisterMapper registerMapper;
	@Override
	public User register(String username, String password, String email, String phone, String address) {
		// TODO Auto-generated method stub
		return registerMapper.insertuser(username, password, email, phone, address);
	}

}
