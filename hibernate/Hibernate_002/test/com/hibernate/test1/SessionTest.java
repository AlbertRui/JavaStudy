package com.hibernate.test1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

/**
 * session测试类
 * 
 * @author Administrator
 *
 */
public class SessionTest {

    @Test
    public void testOpenSession() {
	// 获得配置对象
	Configuration config = new Configuration().configure();
	// 获得服务注册对象
	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties())
		.buildServiceRegistry();
	// 获得会话工厂
	SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
	// 开启会话
	Session session = sessionFactory.openSession();
	if (session != null) {
	    System.out.println("session会话创建成功！！！");
	} else {
	    System.out.println("session会话创建失败！！！");
	}
    }

    @Test
    public void testGetCurrentSession() {

	Configuration config = new Configuration().configure();
	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties())
		.buildServiceRegistry();
	SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
	Session session = sessionFactory.getCurrentSession();
	if (session != null) {
	    System.out.println("session创建成功！！！");
	} else {
	    System.out.println("session创建失败！！！");
	}
    }
}
