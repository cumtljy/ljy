package org.fkit.service;

import java.util.List;

import org.fkit.domain.Detail;
import org.fkit.domain.Order;





/**
 * Book服务层接口
 * */
public interface OrderService {
	
	/**
	 * 查找所有图书
	 * @return Book对象集合
	 * */
	List<Order> getAll(String username);




//	Detail insertdetail(int oid, int goodid, Double price, int quantity);

	Order insertorder(String username, Double totalprice, String phone, String address, String status, int goodid, Double price, int quantity);

	List<Detail> getAll1(int id);

	

	



	
	

}