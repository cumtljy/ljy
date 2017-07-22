package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Collect;


/**
 * BookMapper接口
 * */
public interface CollectMapper {

	/**
	 * 查询所有图书
	 * @return 图书对象集合
	 * */
	@Select(" select * from tb_collect where username=#{username}")
	List<Collect> findAll(String username);
	@Select("insert into tb_collect(good_name,price,image,goodid,username) values(#{good_name},#{price},#{image},#{goodid},#{username})")
	Collect newcollect(@Param("good_name")String good_name,@Param("price")Double price,@Param("image")String image,
			@Param("goodid")int goodid,@Param("username")String username);
	@Delete("delete from tb_collect where goodid=#{goodid}")
	void deletecollect(int goodid);
   
	@Select("select * from tb_collect where username = #{username} and goodid = #{goodid}")
	Collect collectFind(@Param("username")String username,
			@Param("goodid") int goodid);


}