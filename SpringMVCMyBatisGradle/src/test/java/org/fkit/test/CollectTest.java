package org.fkit.test;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.Collect;

import org.fkit.factory.FKSqlSessionFactory;
import org.fkit.mapper.CollectMapper;


public class CollectTest {
	public static void main(String[] args) throws Exception {
		 String resource = "applicationContext.xml;springmvc-config.xml;";
		 Reader reader = null;
	        try {
	            reader = Resources.getResourceAsReader(resource);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		// 创建Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();	
		CollectTest t = new CollectTest();
		CollectMapper em = session.getMapper(CollectMapper.class);
		
// 	       t.testFindCollect(em);
  	       t.testAddCollect(em);
//         t.testDeleteCollect(em);
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}
	
	// 根据动态参数查询商品
	public void testFindCollect(CollectMapper em){
		// 使用Map装载参数
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("username", "2");	
		// 调用selectWhitParam方法
		List<Collect> list = em.findcollect(param);
		// 查看返回结果
		System.out.println(list);
	}
	// 根据动态参数查询商品
		public void testAddCollect(CollectMapper em){
			// 使用Map装载参数
			Collect e = new Collect();	
			e.setGoodid(123456);
			e.setUserid(12);
			e.setGood_name("3");
			e.setPrice((double) 45);
			e.setUsername("2");
			e.setImage("g1.jpg");
			
			// 注意：没有设置state属性，则insert语句中不会包含state列
			// e.setState("ACTIVE");
			em.addcollect(e);
			System.out.println("收藏成功！商品名称：" + e.getGood_name() );
		}
		public void testDeleteCollect(CollectMapper em){
			// 使用Map装载参数
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("goodid", 15);
			
			// 动态删除
			em.deleteCollect(param);
			System.out.println("删除成功");

		}
	
}
