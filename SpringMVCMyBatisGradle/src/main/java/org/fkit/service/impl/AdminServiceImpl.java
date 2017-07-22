package org.fkit.service.impl;

import java.util.List;





import org.fkit.domain.Admin;
import org.fkit.domain.Good;
import org.fkit.domain.Order;

import org.fkit.mapper.AdminMapper;
import org.fkit.service.AdminService;

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
@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private AdminMapper adminMapper;

	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public Admin adminlogin(String adminname, String adminpassword) {
		// TODO Auto-generated method stub
		return adminMapper.findWithAdminnameAndAdminpassword(adminname, adminpassword);
	}

	@Override
	public Good addproduct(String good_name, Double price, String image,String image2,String image3,
			 int stock, int sales, int catagory_sn) {
		// TODO Auto-generated method stub
		return adminMapper.addproduct(good_name,price, image, image2, image3, stock,  sales, catagory_sn);
	}

	
	@Override
	public Good updateproduct(int id,String good_name, Double price, int catagory_sn) {
		// TODO Auto-generated method stub
		return adminMapper.updateproduct(id,good_name,price,catagory_sn);
	}
	
	@Override
	public void deleteproduct(int id) {
		// TODO Auto-generated method stub
	 adminMapper.deleteproduct(id);
	}
	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return adminMapper.findAll();
	}

	@Override
	public Order updateorder(int id, String status, Double totalprice, String phone,
			String address) {
		// TODO Auto-generated method stub
		return adminMapper.updateorder(id, status, address, phone, totalprice);
	}
	@Override
	public List<Good> getAll1() {
		// TODO Auto-generated method stub
		return 	adminMapper.findAll1();
	
}
	@Override
	public Good updatestock(int id, String good_name, int stock, int sales) {
		// TODO Auto-generated method stub
		return adminMapper.updatestock(id, good_name,stock,sales);
	}

	@Override
	public List<Good> getAll2(int id) {
		// TODO Auto-generated method stub
		return adminMapper.findAll2(id);
	}

}
