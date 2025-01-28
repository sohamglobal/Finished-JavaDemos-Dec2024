package com.sharayu.beans;

public class ResultFinder {

	private int marks;
	private String result;
	
	public String getResult() {
		return result;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
		
		if(marks>=35)
		{
			result="Congrats! You are pass";
		}
		else
		{
			result="Sorry! You are fail";
		}
		
	}
	
	
	

}
