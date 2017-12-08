package com.hibernate.test1;

import java.util.Date;

/**
 * 学生类
 * 
 * @author Administrator
 *
 */
public class Students {

    private int sid;// 学生id
    private String sname;// 学生姓名
    private String gender;// 性别
    private Date birthday;// 生日
    private String address;// 地址

    public Students() {

    }

    public Students(int sid, String sname, String gender, Date birthday, String address) {
	this.sid = sid;
	this.sname = sname;
	this.gender = gender;
	this.birthday = birthday;
	this.address = address;
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

    public String getGender() {
	return gender;
    }

    public void setGender(String gender) {
	this.gender = gender;
    }

    public Date getBirthday() {
	return birthday;
    }

    public void setBirthday(Date birthday) {
	this.birthday = birthday;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    @Override
    public String toString() {
	return "Students [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", birthday=" + birthday
		+ ", address=" + address + "]";
    }

}
