package com.sharayu.classes;

public class MathCalculator {
	private int result;
	
	public MathCalculator()
	{
		result=0;
	}
	
	@Deprecated
	public void divide(int x,int y)
	{
		result=x/y;
		System.out.println("Result of division is "+result);
	}
	
	public void newDivide(int x,int y)
	{
		try
		{
			result=x/y;
			System.out.println("Division is "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cant divide by zero");
		}
	}

}
