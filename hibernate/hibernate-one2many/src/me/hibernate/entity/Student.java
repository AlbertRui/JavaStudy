package me.hibernate.entity;

import java.io.Serializable;

/**
 * 学生实体类
 * 
 * @author Administrator
 *
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private int sid;
    private String sname;
    private String sex;
    //在多方定义一个一方的引用
    private Grade grade;

    public Student() {

    }

    public Student(String sname, String sex) {
	this.sname = sname;
	this.sex = sex;
    }

    public int getSid() {
	return sid;
    }

    public void setSid(int sid) {
	this.sid = sid;
    }

    public String getSname() {
	return sname;
    }

    public void setSname(String sname) {
	this.sname = sname;
    }

    public String getSex() {
	return sex;
    }

    public void setSex(String sex) {
	this.sex = sex;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sex=" + sex + "]";
    }

}
