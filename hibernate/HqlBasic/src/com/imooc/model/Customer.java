package com.imooc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户信息持久化类
 * 
 * @author Administrator
 * 
 */
public class Customer implements Serializable {

    private Long id;// 主键
    private String name;// 姓名
    private String tel;// 电话
    private String address;// 地址
    private String email;// 电子邮箱
    private String sex;// 性别
    private String description;// 自我介绍
    private Integer age;// 年龄
    private Date birthday;// 出生日期

    public Customer() {

    }

    public Customer(Long id, String name, String tel, String sex, Integer age, String email, String address) {
	this.id = id;
	this.name = name;
	this.tel = tel;
	this.sex = sex;
	this.age = age;
	this.email = email;
	this.address = address;

    }

    public Customer(Long id, String name) {
	this.id = id;
	this.name = name;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getTel() {
	return tel;
    }

    public void setTel(String tel) {
	this.tel = tel;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getSex() {
	return sex;
    }

    public void setSex(String sex) {
	this.sex = sex;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }

    public Date getBirthday() {
	return birthday;
    }

    public void setBirthday(Date birthday) {
	this.birthday = birthday;
    }

    public String toString() {
	return "主键:" + this.getId() + "    |    姓名:" + this.getName() + "    |     电话:" + this.getTel() + "    |   性别 :"
		+ this.getSex() + "    |   年龄:" + this.getAge() + "    |   出生日期:" + this.getBirthday() + "    |    地址:"
		+ this.getAddress() + "    |   电子邮箱:" + this.getEmail() + "    |   自我介绍:" + this.getDescription();
    }

}
