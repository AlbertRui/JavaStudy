package com.hibernate.test1;

/**
 * 地址类
 * 
 * @author Administrator
 *
 */
public class Address {

    private String postcode;
    private String postphone;
    private String address;

    public Address() {

    }

    public Address(String postcode, String postphone, String address) {
	// super();
	this.postcode = postcode;
	this.postphone = postphone;
	this.address = address;
    }

    public String getPostcode() {
	return postcode;
    }

    public void setPostcode(String postcode) {
	this.postcode = postcode;
    }

    public String getPostphone() {
	return postphone;
    }

    public void setPostphone(String postphone) {
	this.postphone = postphone;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

}
