package me.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * hibernate 相关工具类
 * 
 * @author Administrator
 *
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;
    private static Session session;
    static {
	Configuration config = new Configuration().configure();
	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties())
		.buildServiceRegistry();
	sessionFactory = config.buildSessionFactory(serviceRegistry);
    }

    /**
     * 获取会话工厂
     * 
     * @return
     */
    public static SessionFactory getSessionFactory() {
	return sessionFactory;
    }

    /**
     * 获取session
     * 
     * @return
     */
    public static Session getSession() {
	session = sessionFactory.openSession();
	return session;
    }

    /**
     * 关闭session
     * 
     * @param session
     */
    public static void closeSession(Session session) {
	if (session != null) {
	    session.close();
	    sessionFactory.close();
	}
    }
}
