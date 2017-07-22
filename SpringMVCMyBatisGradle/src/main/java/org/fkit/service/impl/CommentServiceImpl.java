package org.fkit.service.impl;




import java.util.List;

import org.fkit.domain.Collect;
import org.fkit.domain.Comment;
import org.fkit.domain.Order;
import org.fkit.mapper.CommentMapper;
import org.fkit.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("commentService")
public class CommentServiceImpl implements CommentService {
	
	/**
	 * 自动注入BookMapper
	 * */
	@Autowired
	private CommentMapper commentMapper;

	/**
	 * BookService接口getAll方法实现
	 * @see { BookService }
	 * */

	@Override
	public Comment comment(int oid,String username,String service, String logistics, String quality, String comments, String image) {
		// TODO Auto-generated method stub
		return commentMapper.insertcomment(oid,username,service,logistics,quality,comments,image);
	}

	

	@Override
	public List<Order> getAll1(int id) {
		// TODO Auto-generated method stub
		return commentMapper.findAll1(id);
	}


}
