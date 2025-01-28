package com.ethan.classes;

public class Student {
	private int rollno;
	private String studnm;
	private Address address;
	
	public Student(int rollno, String studnm, Address address) {
		super();
		this.rollno = rollno;
		this.studnm = studnm;
		this.address = address;
	}

	public int getRollno() {
		return rollno;
	}

	public String getStudnm() {
		return studnm;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studnm=" + studnm + ", address=" + address + "]";
	}
	
	
	
	

}
