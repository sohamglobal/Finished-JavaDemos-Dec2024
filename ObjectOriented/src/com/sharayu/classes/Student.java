package com.sharayu.classes;

public class Student {
	//data member of the class
	private String studnm;
	
	//constructor
	public Student()
	{
		System.out.println("Welcome to our school");
	}
	
	
	
	public void setStudnm(String studnm) {
		this.studnm = studnm;
	}

	

	public String getStudnm() {
		return studnm;
	}



	public void showName()
	{
		System.out.println("Name is "+studnm);
	}

}
