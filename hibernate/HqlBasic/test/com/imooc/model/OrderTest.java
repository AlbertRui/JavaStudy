package com.imooc.model;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.imooc.util.HibernateSessionFactory;

public class OrderTest {
	private Session session = null;
	
	@Test
	public void testWhere1(){
		String hql = " from Order o where o.orderItems is not empty ";
		Query query = session.createQuery(hql);
		List<Order> orders = query.list();
		
		for(Order order : orders){
			System.out.println(order.getCustomer().getName());
			System.out.println(order.getAmount());
			System.out.println(order.getTradeDate());
		}
	}

	@Before
	public void setUp() throws Exception {
		session = HibernateSessionFactory.getCurrentSession();
	}

	@After
	public void tearDown() throws Exception {
		session.close();
	}

}
