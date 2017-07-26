package org.fkit.mapper;

import java.util.List;

import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Cart;


/**
 * shopMapper接口
 * */
public interface CartMapper {

	/**
	 * 查询所有购物信息
	 * @return 对象集合
	 * */
	@Select(" select * from tb_cart where username=#{username} ")
	List<Cart> findAll(String username);
	
	@Select("insert into tb_cart(goodid,good_name,price,image,quantity,username) values(#{goodid},#{good_name},#{price},#{image},#{quantity},#{username})")
	Cart newcart(@Param("goodid")int goodid,@Param("good_name")String good_name,@Param("price")Double price,@Param("image")String image,@Param("quantity")int quantity,
			@Param("username")String username);
	
	@Delete("delete from tb_cart where goodid=#{goodid}")
	void deletecart(int goodid);
	
	@Select("update tb_cart set quantity=#{quantity} where goodid=#{goodid} and username=#{username}")
	Cart updatecart(@Param("goodid")int goodid,@Param("username")String username,@Param("quantity")int quantity);

	@Select(" select * from tb_cart where username=#{username} and goodid=#{goodid}  ")
	Cart selectCartWithUsername(Map<String, Object> param);

	@Select("update tb_cart set quantity=#{quantity} where  username=#{username} and goodid=#{goodid}")
	void updateCart(Cart e);

	@Delete("delete from tb_cart where username=#{username} and goodid=#{goodid}")
	void deleteCart(Map<String, Object> param);

	@Select(" select * from tb_cart where username=#{username} ")
	List<Cart> selectWhitParam(Map<String, Object> param);

	@Select("select * from tb_cart where username = #{username} and goodid = #{goodid}")
	Cart cartFind(@Param("username")String username, @Param("goodid")int goodid);

	@Select("update tb_cart set quantity=#{quantity}+quantity where goodid=#{goodid} and username=#{username}")
	Cart update(@Param("goodid")int goodid,@Param("username")String username,@Param("quantity")int quantity);

	
}
