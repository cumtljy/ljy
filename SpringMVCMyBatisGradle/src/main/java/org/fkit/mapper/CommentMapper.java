package org.fkit.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Comment;
import org.fkit.domain.Order;


public interface CommentMapper {

	/**
	 * 查询所有图书
	 * @return 图书对象集合
	 * */

	
	@Select("insert into tb_comment(oid,username,service,logistics,quality,comments,image) values(#{oid},#{username},#{service},#{logistics},#{quality},#{comments},#{image})")
	Comment insertcomment(@Param("oid")int oid,@Param("username")String username,@Param("service")String service,@Param("logistics")String logistics,@Param("quality")String quality,
			@Param("comments")String comments,@Param("image")String image);
	
	@Select(" select * from tb_order where id=#{id} ")
	List<Order> findAll1(int id);
	

}

