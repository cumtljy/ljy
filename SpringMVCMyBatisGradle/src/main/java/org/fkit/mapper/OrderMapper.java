package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Detail;
import org.fkit.domain.Order;



/**
 * BookMapper接口
 * */
public interface OrderMapper {

	/**
	 * 查询所有图书
	 * @param username 
	 * @return 图书对象集合
	 * */
	@Select(" select * from tb_order where username=#{username} ")
	List<Order> findAll(@Param("username")String username);
	
//	@Select(" select * from order_details where oid=#{oid} ")
//	List<Detail> findDetail(@Param("oid")int oid);
	
	@Select("insert into tb_order(username,totalprice,phone,address,status,goodid,price,quantity) values(#{username},#{totalprice},#{phone},#{address},#{status},#{goodid},#{price},#{quantity})")
	Order insertorder(@Param("username")String username, @Param("totalprice")Double totalprice, @Param("phone")String phone, @Param("address")String address, @Param("status")String status, @Param("goodid")int goodid, @Param("price")Double price, @Param("quantity")int quantity);

	@Select(" select * from tb_order where id=#{id} ")
	List<Detail> findAll1(int id);
	
//	@Select(" insert into  order_details(oid,goodid,price,quantity) values(#{tb_order.id},#{goodid},#{price},#{quantity})")
//	Detail insertdetail(@Param("oid")int oid,@Param("goodid")int goodid, @Param("price")Double price, @Param("quantity")int quantity);

	
	//	Order insertorder(@Param("username")String username,@Param("totalprice")Double totalprice,@Param("phone")String phone,@Param("address")String address,@Param("status")String status
//			);
}