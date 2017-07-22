package org.fkit.service;

import java.util.List;


import org.fkit.domain.Comment;
import org.fkit.domain.Order;


public interface CommentService {
	Comment comment(int oid,  String username,String service, String logistics, String quality, String comments, String image);

	

	List<Order> getAll1(int id);



}
