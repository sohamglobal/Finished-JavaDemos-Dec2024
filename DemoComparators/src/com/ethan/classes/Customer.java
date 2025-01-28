package com.ethan.classes;

public class Customer {
	private int custno;
	private String custnm;
	private String gender;
	private int age;
	
	public Customer(int custno, String custnm, String gender, int age) {
		super();
		this.custno = custno;
		this.custnm = custnm;
		this.gender = gender;
		this.age = age;
	}

	public int getCustno() {
		return custno;
	}

	public String getCustnm() {
		return custnm;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Customer [custno=" + custno + ", custnm=" + custnm + ", gender=" + gender + ", age=" + age + "]";
	}
	
	

}
