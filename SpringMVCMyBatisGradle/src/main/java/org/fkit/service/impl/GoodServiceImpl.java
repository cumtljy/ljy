package org.fkit.service.impl;
import java.util.List;

import org.fkit.domain.Comment;
import org.fkit.domain.Good;

import org.fkit.mapper.GoodMapper;
import org.fkit.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Book服务层接口实现类
 * @Service("bookService")用于将当前类注释为一个Spring的bean，名为bookService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("goodService")
public class GoodServiceImpl implements GoodService {
	
	/**
	 * 自动注入BookMapper
	 * */
	@Autowired
	private GoodMapper goodMapper;

	/**
	 * BookService接口getAll方法实现
	 * @see { BookService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public List<Good> getAll() {
		
		return goodMapper.findAll();
	}
	 public List<Good> getAll1() {
			
			return goodMapper.findAll1();
		}
	   
	   public List<Good> getAll2() {
			
			return goodMapper.findAll2();
		}
	   
	   public List<Good> getAll3() {
			
			return goodMapper.findAll3();
		}
	   public List<Good> getAll4(int id) {
			
			return goodMapper.findAll4( id);
		}

	   @Override
		public List<Comment> getAll5(int id) {
			// TODO Auto-generated method stub
			return goodMapper.findAll5(id);
		}
	
}
