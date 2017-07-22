package org.fkit.test;
import java.util.HashMap;

import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.User;
import org.fkit.factory.FKSqlSessionFactory;
import org.fkit.mapper.UserMapper;

public class UserTest {
	
	public static void main(String[] args) throws Exception {
		// 创建Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		UserTest t = new UserTest();
		// 获取EmployeeMapper对象
		UserMapper em = session.getMapper(UserMapper.class);
		
//	    t.testInsertUser(em);
		t.testDeleteUser(em);
//    	t.testUpdateUserPassword(em);
		
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

//  添加用户	
public void testInsertUser(UserMapper em){

	User e = new User();	
	e.setPassword("123456");
	e.setUsername("静玉");
	e.setEmail("123@123");
	e.setPhone("13270336096");
	e.setAddress("包头");
	// 注意：没有设置state属性，则insert语句中不会包含state列
	// e.setState("ACTIVE");
	em.insertuser3(e);
	System.out.println("插入成功！username：" + e.getUsername() );
}

// 更新密码
public void testUpdateUserPassword(UserMapper em){
	// 使用Map装载参数
	Map<String, Object> param = new HashMap<String, Object>();
	param.put("username", "静玉");
	User e = em.selectUserWithUsername(param);
	e.setPassword("3333");
	em.updateUserPassword(e);
	System.out.println("修改成功password：" + e.getPassword() );
}

//删除用户
public void testDeleteUser(UserMapper em){
	// 使用Map装载参数
	Map<String, Object> param = new HashMap<String, Object>();
	param.put("username", "静玉");
	// 动态删除
	em.deleteUser(param);
	System.out.println("删除成功 ");
}
}


