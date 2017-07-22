package org.fkit.service.impl;

import java.util.List;



import org.fkit.domain.Cart;

import org.fkit.mapper.CartMapper;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("CartService")
public class CartServiceImpl implements CartService {
	
	/**
	 * 自动注入ShopMapper
	 * */
	@Autowired
	private CartMapper cartMapper;

	
	@Transactional(readOnly=true)
	@Override
	public List<Cart> getAll(String username) {
		
		return cartMapper.findAll (username);
	}

	@Override
	public Cart newcart(int goodid,String good_name, Double price, String image, int quantity, String username) {
		// TODO Auto-generated method stub
		return cartMapper.newcart(goodid,good_name, price,image,quantity,username);

	}
	
	@Override
	public void deletecart(int goodid) {
		// TODO Auto-generated method stub
		cartMapper.deletecart(goodid);
	}
	
	@Override
	public Cart updatecart(int goodid, String username,int quantity) {
		// TODO Auto-generated method stub
		return  cartMapper.updatecart(goodid,username,quantity);
	}
}