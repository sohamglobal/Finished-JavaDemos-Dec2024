package com.sohamglobal.classes;

public class Employee {
	private int empno;
	private String empnm;
	private String department;
	private String post;
	private String location;
	private float salary;
	
	public Employee(int empno, String empnm, String department, String post, String location, float salary) {
		super();
		this.empno = empno;
		this.empnm = empnm;
		this.department = department;
		this.post = post;
		this.location = location;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empnm=" + empnm + ", department=" + department + ", post=" + post
				+ ", location=" + location + ", salary=" + salary + "]";
	}

	public String getEmpnm() {
		return empnm;
	}

	public String getLocation() {
		return location;
	}

	
}
