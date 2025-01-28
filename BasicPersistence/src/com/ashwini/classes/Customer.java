package com.ashwini.classes;

import java.io.Serializable;

public class Customer implements Serializable {
	private int custid;
	private String custnm;
	private String gender;
	private int age;
	private String city;
	private String mobile;
	
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public void setCustnm(String custnm) {
		this.custnm = custnm;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void showCustomerInfo()
	{
		System.out.println("Customer Details");
		System.out.println("--------------------------");
		System.out.println("Customer ID : "+custid);
		System.out.println("Customer Name : "+custnm);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
		System.out.println("City : "+city);
		System.out.println("Mobile : "+mobile);
		System.out.println("---------------------------");
	}

}
