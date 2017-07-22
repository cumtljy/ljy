package org.fkit.service.impl;

import java.util.List;


import org.fkit.domain.Detail;
import org.fkit.domain.Order;
import org.fkit.mapper.OrderMapper;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Book服务层接口实现类
 * @Service("bookService")用于将当前类注释为一个Spring的bean，名为bookService
 * @param <OrderMapper>
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("orderService")
public class OrderServiceImpl implements OrderService {
	
	/**
	 * 自动注入CartMapper
	 * */
	@Autowired
	private OrderMapper orderMapper;

	/**
	 * CartService接口getAll方法实现
	 * @see {CartService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public List<Order> getAll(String username) {
		return orderMapper.findAll (username);
	}

	
	@Override
	public List<Detail> getAll1(int id) {
		return orderMapper.findAll1 (id);
	}
	

	
	
	@Override	
	public Order insertorder(String username, Double totalprice, String phone, String address,String status, int goodid, Double price, int quantity) {
		// TODO Auto-generated method stub
		return orderMapper.insertorder(username, totalprice,phone,address,status,goodid,price,quantity);
	}
	
//	@Override	
//	public Detail insertdetail(int oid,int goodid, Double price, int quantity) {
//		// TODO Auto-generated method stub
//		return orderMapper.insertdetail(oid,goodid, price,quantity);
//	}
	
}
