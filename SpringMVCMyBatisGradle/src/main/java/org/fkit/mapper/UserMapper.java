package org.fkit.mapper;

import java.util.List;

import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from tb_user where username = #{username} and password = #{password}")
	User findWithUsernameAndPassword(@Param("username")String username,
			@Param("password") String password);
	
//	@Select("select * from tb_user where username=#{username} and email=#{email} and phone=#{phone}")
//	User findPassword(@Param("username")String username,@Param("email")String email,@Param("phone")String phone);
	
	@Select("update tb_user set username=#{username},password=#{password},email=#{email},phone=#{phone},address=#{address} where username=#{username}")
	User update(@Param("username")String username,
			@Param("password")String password,@Param("email")String email,@Param("phone")String phone,
			@Param("address")String address);

	@Select("select * from tb_user where username = #{username} ")
	User selectUserWithUsername(Map<String, Object> param);

	@Select("update tb_user set password=#{password} where username=#{username}")
	void updateUserPassword(User e);

	@Select("insert into tb_user(username,password,email,phone,address) values(#{username},#{password},#{email},#{phone},#{address})")
	void insertuser3(User e);

	@Delete("delete from tb_user where username=#{username}")
	void deleteUser(Map<String, Object> param);

   @Select("select * from tb_user where username=#{username} and email=#{email}")
	User findPassword(@Param("username")String username,
			@Param("email") String email);
   
    @Select("select * from tb_user where username = #{username} ")
    List<User> findAll(String username);


}

