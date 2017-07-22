package org.fkit.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Comment;
import org.fkit.domain.Good;


/**
 * BookMapper接口
 * */
public interface GoodMapper {

	/**
	 * 查询所有图书
	 * @return 图书对象集合
	 * */
	@Select(" select * from tb_good ")
	List<Good> findAll();
	
	@Select(" select * from tb_good where catagory_sn=1")
	List<Good> findAll1();
	
	@Select(" select * from tb_good where catagory_sn=2")
	List<Good> findAll2();
	
	@Select(" select * from tb_good where catagory_sn =3")
	List<Good> findAll3();
		@Insert("insert into tb_good(goodid,good_name,price,category_sn,image,image2,image3,stock,sales) values(#{goodid},#{good_name},#{catagory_sn},#{image},#{image2},#{image3},#{stock},#{sales})")
		void insertthing(@Param("goodid")int goodid,
				         @Param("good_name")String good_name,
				         @Param("price")Double price,
		   				@Param("catagory_sn")int catagry_sn,
						@Param("image")String image,
						@Param("image2")String image2,
						@Param("image3")String image3,
						@Param("stock")int stock,
						@Param("sales")int sales);


      @Select(" select * from tb_good where id=#{id}")

		List<Good> findAll4(int id);
      
      @Select(" select * from tb_comment where id=#{id}")
  	List<Comment> findAll5(int id);

      @Select(" select * from tb_good where id=#{id}")
      List<Good> selectWhitParam(Map<String, Object> param);
}
