package org.fkit.test;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.Good;
import org.fkit.factory.FKSqlSessionFactory;

import org.fkit.mapper.GoodMapper;


public class GoodTest {

	public static void main(String[] args) throws Exception {

		// 创建Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();	
		GoodTest t = new GoodTest();
		GoodMapper em = session.getMapper(GoodMapper.class);
		
  	       t.testSelectWhitParam(em);
//  	   t.testInsertthing(em);
//          t.testDeleteGood(em);
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}
	
	// 根据动态参数查询商品
	public void testSelectWhitParam(GoodMapper em){
		// 使用Map装载参数
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", "1");	
		// 调用selectWhitParam方法
		List<Good> list = em.selectWhitParam(param);
		// 查看返回结果
		System.out.println(list);
	}
	// 根据动态参数查询商品
		public void testInsertthing(GoodMapper em){
			// 使用Map装载参数
			Good e = new Good();	
			e.setGood_name("123456");
			e.setPrice((double) 12);
			e.setCatagory_sn(3);
			e.setImage("g1.jpg");
			e.setStock(78);
			e.setSales(23);
			e.setImage2("g1.jpg");
			e.setImage3("g1.jpg");
			// 注意：没有设置state属性，则insert语句中不会包含state列
			// e.setState("ACTIVE");
			em.insertthing(e);
			System.out.println("插入成功！商品名称：" + e.getGood_name() );
		}
		public void testDeleteGood(GoodMapper em){
			// 使用Map装载参数
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("id", 40);
			
			// 动态删除
			em.deleteGood(param);
			System.out.println("删除成功");

		}
	
}
