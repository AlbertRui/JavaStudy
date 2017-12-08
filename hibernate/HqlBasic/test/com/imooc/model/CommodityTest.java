package com.imooc.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.imooc.util.HibernateSessionFactory;

public class CommodityTest {
    private Session session = null;

    @Test
    public void testOrderby() {
	String hql = " from Commodity order by seller.id asc,price desc,name asc  ";
	Query query = session.createQuery(hql);
	List<Commodity> commodities = query.list();

	for (Commodity c : commodities) {
	    System.out.println("name:" + c.getName());
	    System.out.println("price:" + c.getPrice());
	}
    }

    @Test
    public void testWhere4() {
	String hql = " from Commodity c where c.price*5>3000 ";
	Query query = session.createQuery(hql);
	List<Commodity> commodities = query.list();

	for (Commodity c : commodities) {
	    System.out.println("name:" + c.getName());
	    System.out.println("price:" + c.getPrice() * 5);
	}
    }

    @Test
    public void testWhere3() {
	String hql = " from Commodity c where c.price<200 or c.price>3000 ";
	Query query = session.createQuery(hql);
	List<Commodity> commodities = query.list();

	for (Commodity c : commodities) {
	    System.out.println("name:" + c.getName());
	    System.out.println("price:" + c.getPrice());
	}
    }

    @Test
    public void testWhere2() {
	String hql = " from Commodity c where c.price between 1000 and 5000 and c.category like '%����%' or name like '%����%' ";
	Query query = session.createQuery(hql);
	List<Commodity> commodities = query.list();

	for (Commodity c : commodities) {
	    System.out.println("name:" + c.getName());
	    System.out.println("category:" + c.getCategory());
	    System.out.println("price:" + c.getPrice());
	}
    }

    @Test
    public void testWhere1() {
	String hql = " from Commodity c where c.price<=200 ";
	Query query = session.createQuery(hql);
	List<Commodity> commodities = query.list();

	for (Commodity c : commodities) {
	    System.out.println("name:" + c.getName());
	    System.out.println("price:" + c.getPrice());
	}
    }

    @Test
    public void testFromClause() {
	String hql = " from Commodity ";

	Query query = session.createQuery(hql);
	List<Commodity> commodities = query.list();

	for (Commodity c : commodities) {
	    System.out.println("name:" + c.getName());

	    System.out.println("seller's name :" + c.getSeller().getName());
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
