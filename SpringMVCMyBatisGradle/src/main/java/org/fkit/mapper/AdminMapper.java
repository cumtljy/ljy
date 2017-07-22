package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Admin;
import org.fkit.domain.Good;
import org.fkit.domain.Order;




/**
 * UserMapper接口
 * */
public interface AdminMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from tb_admin where adminname = #{adminname} and adminpassword = #{adminpassword}")
	Admin findWithAdminnameAndAdminpassword(@Param("adminname")String adminname,@Param("adminpassword") String adminpassword);

	@Select("insert into tb_good(good_name,price, image,image2,image3,stock, sales,catagory_sn) values (#{good_name},#{price},#{image},#{image2},#{image3},#{stock},#{sales},#{catagory_sn})")
	Good addproduct(@Param("good_name")String good_name,@Param("price")Double price,
			@Param("image")String image,
			@Param("image2")String image2,
			@Param("image3")String image3,
			@Param("stock")int stock,@Param("sales")int sales,@Param("catagory_sn")int catagory_sn);

	@Select(" select * from tb_order ")
	List<Order> findAll();
	
	@Select("update tb_order set status=#{status} ,address=#{address},phone=#{phone},totalprice=#{totalprice}, id=#{id} where id=#{id}")
	Order updateorder(@Param("id")int id,@Param("status")String status,@Param("address")String address,@Param("phone")String phone,@Param("totalprice")Double totalprice);
	
	@Select(" select * from tb_good ")
	List<Good> findAll1();
	@Select("update tb_good set good_name=#{good_name},stock=#{stock},sales=#{sales} where id=#{id}")
	Good updatestock(@Param("id")int id,@Param("good_name")String good_name,@Param("stock")int stock,@Param("sales")int sales);


	
	@Select("update tb_good set good_name=#{good_name},price=#{price},catagory_sn=#{catagory_sn} where id=#{id}")
	Good updateproduct(@Param("id")int id,@Param("good_name")String good_name, @Param("price")Double price, @Param("catagory_sn")int catagory_sn);
	
	@Select(" select * from tb_good where id=#{id} ")
	List<Good> findAll2(@Param("id") int id);

	@Delete("delete from tb_good where id=#{id}")
	void deleteproduct(int id);
}

