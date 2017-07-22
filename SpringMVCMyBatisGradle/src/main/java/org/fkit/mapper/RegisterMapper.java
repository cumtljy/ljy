package org.fkit.mapper;

import org.apache.ibatis.annotations.Param;

import org.apache.ibatis.annotations.Select;
import org.fkit.domain.User;

public interface RegisterMapper {

	@Select("insert into tb_user(username,password,email,phone,address) values(#{username},#{password},#{email},#{phone},#{address})")
	User insertuser(@Param("username")String username,@Param("password")String password,@Param("email")String email,
			@Param("phone")String phone,@Param("address")String address);
}
