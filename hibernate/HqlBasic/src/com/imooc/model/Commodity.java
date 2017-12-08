package com.imooc.model;

import java.io.Serializable;

/**
 * 商品信息持久化类
 * 
 * @author Administrator
 * 
 */
public class Commodity implements Serializable {
    private Long id;// 主键
    private String name;// 名称
    private Double price;// 价格
    private String unit;// 单位
    private String category;// 类别
    private String description;// 简介
    private Seller seller;// 商家

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

    public Double getPrice() {
	return price;
    }

    public void setPrice(Double price) {
	this.price = price;
    }

    public String getUnit() {
	return unit;
    }

    public void setUnit(String unit) {
	this.unit = unit;
    }

    public String getCategory() {
	return category;
    }

    public void setCategory(String category) {
	this.category = category;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public Seller getSeller() {
	return seller;
    }

    public void setSeller(Seller seller) {
	this.seller = seller;
    }

    public String toString() {
	return "主键:" + this.getId() + "    |   名称:" + this.getName() + "    |     价格:" + this.getPrice()
		+ "    |   单位 :" + this.getUnit() + "    |   分类:" + this.getCategory() + "    |   经营商家:"
		+ this.getSeller().getName() + "    |   简介:" + this.getDescription();
    }

}
