package com.imooc.model;


import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.imooc.util.HibernateSessionFactory;

public class CustomerTest {
	private Session session = null;
	
	@Test
	public void testOrderby(){
		String hql = " from Customer order by age desc ";
		Query query = session.createQuery(hql);
		List<Customer> customers = query.list();
		
		for(Customer c: customers){
			System.out.println("name:"+c.getName());
			System.out.println("age:"+c.getAge());
		}
	}
	
	@Test
	public void testWhere4(){
		String hql = " from Customer c where c.age>20 ";
		Query query = session.createQuery(hql);
		
		Customer c = (Customer)query.uniqueResult();
		
		System.out.println(c.getName());
	}
	
	@Test
	public void testWhere3(){
		String hql = " from Customer c where c.address like '%±±¾©%'";
		Query query = session.createQuery(hql);
		List<Customer> customers = query.list();
		
		for(Customer c : customers){
			System.out.println("name:"+c.getName());
			System.out.println("address :"+ c.getAddress());
		}
	}
	
	@Test
	public void testWhere2(){
		String hql = " from Customer c where c.age not between 20 and 40 ";
		Query query = session.createQuery(hql);
		List<Customer> customers = query.list();
		
		for(Customer c: customers){
			System.out.println("name:"+c.getName());
			System.out.println("age:"+c.getAge());
		}
	}
	
	@Test
	public void testWhere1(){
		String hql = "  from Customer c where c.sex<>'ÄÐ'";
		Query query = session .createQuery(hql);
		List<Customer> customers = query.list();
		
		for(Customer c : customers){
			System.out.println("name:"+c.getName());
			System.out.println("sex:"+c.getSex());
		}
	}
	
	@Test
	public void testDistinct(){
		String hql = "select distinct c.sex from Customer c ";
		Query query = session.createQuery(hql);
		List<Object> list = query.list();
		
		for(Object obj : list){
			System.out.println(obj);
		}
	}
	
	@Test
	public void testSelectClauseMap(){
		String hql = "select new map(c.name,c.sex,c.age,c.tel ) from Customer c ";
		Query query = session.createQuery(hql);
		List<Map> maps = query.list();
		
		for(Map map : maps){
			System.out.println("name:"+map.get("0"));
			System.out.println("sex:"+map.get("1"));
			System.out.println("age:"+map.get("2"));
			System.out.println("tel:"+map.get("3"));
		}
	}
	
	@Test
	public void testSelectClauseList(){
		String hql = "select new list(c.name,c.sex,c.age,c.tel) from Customer c ";
		Query query = session.createQuery(hql);
		List<List> lists = query.list();
		
		for(List list : lists){
			System.out.println("name:"+list.get(0));
			System.out.println("sex:"+list.get(1));
			System.out.println("age"+list.get(2));
			System.out.println("tel:"+list.get(3));
		}
	}
	
	@Test
	public void testSelectClauseObjectArray(){
		String hql = " select c.name,c.tel,c.age from Customer c ";
		Query query = session.createQuery(hql);
		List<Object[]> list = query.list();
		for(Object[] objs : list){
			System.out.println("name:"+objs[0]);
			System.out.println("tel:"+objs[1]);
			System.out.println("age:"+objs[2]);
		}
	}
	
	@Test
	public void testFromClause(){
		String hql = " from Customer ";
		
		Query query = session.createQuery(hql);
		List<Customer> customers = query.list();
		
		for(Customer customer : customers){
			System.out.println("name:"+customer.getName());
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
