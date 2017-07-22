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
	
	
}
