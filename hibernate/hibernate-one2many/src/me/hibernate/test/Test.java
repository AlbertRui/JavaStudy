package me.hibernate.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import me.hibernate.entity.Grade;
import me.hibernate.entity.Student;
import me.hibernate.util.HibernateUtil;

/**
 * 单向一对多关系关系（班级--->学生） 建立关联关系后，可以方便的从一个对象导航到另一个对象 注意关联的方向*
 * 
 * @author Administrator
 *
 */
public class Test {
    public static void main(String[] args) {
	// add();
	// findStudentsByGrade();
	// update();
	delete();

    }

    /**
     * 将学生添加到班级
     */
    public static void add() {
	Grade grade = new Grade("Java一班", "Java软件开发一班");
	Student stu1 = new Student("张三", "男");
	Student stu2 = new Student("穆女神", "女");

	// 如果希望在学生表中添加对应的班级编号，需要在班级中添加学生，建立关联关系
	grade.getStudents().add(stu1);
	grade.getStudents().add(stu2);

	Session session = HibernateUtil.getSession();
	Transaction tx = session.beginTransaction();
	session.save(grade);
	session.save(stu1);
	session.save(stu2);
	tx.commit();
	HibernateUtil.closeSession(session);
    }

    /**
     * 查询班级中包含的学生
     */
    public static void findStudentsByGrade() {
	Session session = HibernateUtil.getSession();
	Grade grade = (Grade) session.get(Grade.class, 1);
	System.out.println(grade.getGname() + "," + grade.getGdesc());

	Set<Student> students = grade.getStudents();
	for (Student stu : students) {
	    System.out.println(stu);
	}
    }

    /**
     * 修改学生信息
     */
    public static void update() {
	Grade grade = new Grade("Java二班", "Java软件开发二班");

	Session session = HibernateUtil.getSession();
	Transaction tx = session.beginTransaction();
	Student stu = (Student) session.get(Student.class, 1);
	grade.getStudents().add(stu);
	session.save(grade);
	tx.commit();
	HibernateUtil.closeSession(session);
    }

    /**
     * 删除学生信息
     */
    public static void delete() {
	Session session = HibernateUtil.getSession();
	Transaction tx = session.beginTransaction();
	Student stu = (Student) session.get(Student.class, 2);
	session.delete(stu);
	tx.commit();
	HibernateUtil.closeSession(session);
    }
}
