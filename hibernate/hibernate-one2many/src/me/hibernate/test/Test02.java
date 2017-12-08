package me.hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import me.hibernate.entity.Grade;
import me.hibernate.entity.Student;
import me.hibernate.util.HibernateUtil;

/**
 * 单向多对一（学生--->班级）
 * @author Administrator
 *
 */
public class Test02 {
    public static void main(String[] args) {
	save();
    }

    /**
     * 保存
     */
    public static void save() {
	Grade g = new Grade("Java一班", "Java软件开发一班");
	Student stu1 = new Student("慕女神", "女");
	Student stu2 = new Student("小慕慕", "男");

	// 设置关联关系
	g.getStudents().add(stu1);
	g.getStudents().add(stu2);
	stu1.setGrade(g);
	stu2.setGrade(g);

	Session session = HibernateUtil.getSession();
	Transaction tx = session.beginTransaction();
	session.save(g);
	session.save(stu1);
	session.save(stu2);
	tx.commit();
	HibernateUtil.closeSession(session);
    }
}
