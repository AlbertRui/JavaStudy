package com.imooc.model;

import java.io.Serializable;

/**
 * 商家信息持久化类
 * 
 * @author Administrator
 * 
 */
public class Seller implements Serializable {
    private Long id;// 主键
    private String name;// 名称
    private String tel;// 电话
    private String address;// 地址
    private String website;// 网站
    private Integer star;// 星级
    private String business;// 经营范围

    public Seller() {

    }

    public Seller(String name, String tel, String address) {
	this.name = name;
	this.tel = tel;
	this.address = address;
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

    public String getWebsite() {
	return website;
    }

    public void setWebsite(String website) {
	this.website = website;
    }

    public Integer getStar() {
	return star;
    }

    public void setStar(Integer star) {
	this.star = star;
    }

    public String getBusiness() {
	return business;
    }

    public void setBusiness(String business) {
	this.business = business;
    }

    public String toString() {
	return "主键:" + this.getId() + "    |    名称:" + this.getName() + "    |     电话:" + this.getTel() + "    |   星级 :"
		+ this.getStar() + "    |   网址:" + this.getWebsite() + "    |    地址:" + this.getAddress()
		+ "    |   经营范围:" + this.getBusiness();
    }
}
