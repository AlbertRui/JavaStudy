package me.hibernate.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Grade实体类
 * 
 * @author Administrator
 *
 */
public class Grade implements Serializable {

    private static final long serialVersionUID = 1L;
    private int gid;
    private String gname;
    private String gdesc;

    // 一方定义一个多方的集合
    private Set<Student> students = new HashSet<Student>();

    public Grade() {

    }

    public Grade(String gname, String gdesc) {
	this.gname = gname;
	this.gdesc = gdesc;
    }

    public Grade(int gid, String gname, String gdesc, Set<Student> students) {
	this.gid = gid;
	this.gname = gname;
	this.gdesc = gdesc;
	this.students = students;
    }

    public int getGid() {
	return gid;
    }

    public void setGid(int gid) {
	this.gid = gid;
    }

    public String getGname() {
	return gname;
    }

    public void setGname(String gname) {
	this.gname = gname;
    }

    public String getGdesc() {
	return gdesc;
    }

    public void setGdesc(String gdesc) {
	this.gdesc = gdesc;
    }

    public Set<Student> getStudents() {
	return students;
    }

    public void setStudents(Set<Student> students) {
	this.students = students;
    }

}
