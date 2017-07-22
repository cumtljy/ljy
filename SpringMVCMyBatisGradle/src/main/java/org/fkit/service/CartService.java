package org.fkit.service;
import java.util.List;

import org.fkit.domain.Cart;



/**
 * Book服务层接口
 * */
public interface CartService {
	
	/**
	 * 查找所有图书
	 * @return Shop对象集合
	 * */
	List<Cart> getAll(String username);

	Cart newcart(int goodid,String good_name, Double price, String image, int quantity, String username);

	void deletecart(int goodid);
	
	Cart updatecart(int goodid, String username, int quantity);

}
