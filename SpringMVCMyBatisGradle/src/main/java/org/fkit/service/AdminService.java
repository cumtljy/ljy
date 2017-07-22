package org.fkit.service;

import java.util.List;




import org.fkit.domain.Admin;
import org.fkit.domain.Good;
import org.fkit.domain.Order;






/**
 * User服务层接口
 * */
public interface AdminService {
	
	/**
	 * 判断用户登录
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	Admin adminlogin(String adminname,String adminpassword);

	Good addproduct(String good_name, Double price, String image, String image2,String image3, int stock, int sales, int catagory_sn);

	List<Order> getAll();
	Order updateorder(int id, String status, Double totalprice, String phone, String address);
	
	List<Good> getAll1();
	Good updatestock(int id, String good_name, int stock, int sales);

	List<Good> getAll2(int id);
	Good updateproduct(int id,String good_name, Double price, int catagory_sn);

	void deleteproduct(int id);
}
