package org.fkit.service;



import java.util.List;

import org.fkit.domain.Comment;
import org.fkit.domain.Good;




/**
 * Book服务层接口
 * */
public interface GoodService {
	
	/**
	 * 查找所有图书
	 * @return Book对象集合
	 * */
	List<Good> getAll();
    List<Good> getAll1();
	
	List<Good> getAll2();
	
	List<Good> getAll3();
	List<Good> getAll4(int id);
	
	List<Comment> getAll5(int id);
}
