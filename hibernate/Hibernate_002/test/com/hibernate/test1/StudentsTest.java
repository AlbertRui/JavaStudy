package com.hibernate.test1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 测试类
 * @author Administrator
 *
 */
public class StudentsTest {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
    
    @Before
    public void init() {
	//创建配置对象
	Configuration config = new Configuration().configure();
	//创建服务注册对象
	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
	//创建会话工厂
	sessionFactory = config.buildSessionFactory(serviceRegistry);
	//会话对象
	session = sessionFactory.openSession();
	//开启事务
	transaction = session.beginTransaction();
    }
    
    @After
    public void destroy() {
	transaction.commit();//提交事务
	session.close();//关闭会话
	sessionFactory.close();//关闭会话工厂
    }
    
    @Test
    public void testSaveStudents() {
	//创建学生对象
	Students s = new Students(1,"张三丰","男",new Date(),"武当山");
	session.save(s);//保存对象进入数据库
    }
}
