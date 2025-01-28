package com.ashwini.classes;

import java.io.Serializable;

public class Employee implements Serializable {
	private int empno;
	private String empnm;
	private String gender;
	private String location;
	private String dept;
	private String post;
	private String mobile;
	private double salary;
	
	public Employee(int empno, String empnm, String gender, String location, String dept, String post, String mobile,
			double salary) {
		super();
		this.empno = empno;
		this.empnm = empnm;
		this.gender = gender;
		this.location = location;
		this.dept = dept;
		this.post = post;
		this.mobile = mobile;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empnm=" + empnm + ", gender=" + gender + ", location=" + location
				+ ", dept=" + dept + ", post=" + post + ", mobile=" + mobile + ", salary=" + salary + "]";
	}
	
	
	

}
