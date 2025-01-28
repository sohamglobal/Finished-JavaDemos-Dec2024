package com.sharayu.classes;

public class SquareCalculator {
	
	private int square;
	
	//constructor
	//runs automatically when object is created
	public SquareCalculator()
	{
		System.out.println("Welcome to object oriented programming in Java");
		System.out.println("-------------------------------------------------");
	}
	
	public void calcSquare(int n)
	{
		square=n*n;
	}
	
	public void showSquare()
	{
		System.out.println("square is "+square);
	}

}
