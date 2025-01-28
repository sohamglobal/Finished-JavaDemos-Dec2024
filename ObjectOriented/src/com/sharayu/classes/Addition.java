package com.sharayu.classes;

public class Addition {
	private int result;
	
	public void calcSum(int a,int b)
	{
		result=a+b;
	}
	
	public void calcSum(int a,int b,int c)
	{
		result=a+b+c;
	}
	
	public void showSum()
	{
		System.out.println("sum is "+result);
	}
	

}
