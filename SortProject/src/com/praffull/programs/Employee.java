package com.praffull.programs;

public class Employee {
	private String empnm;
	private String location;
	private float salary;
	
	public Employee(String empnm, String location, float salary) {
		super();
		this.empnm = empnm;
		this.location = location;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empnm=" + empnm + ", location=" + location + ", salary=" + salary + "]";
	}

	public String getEmpnm() {
		return empnm;
	}

	public String getLocation() {
		return location;
	}

	public float getSalary() {
		return salary;
	}
	
	
	

}
