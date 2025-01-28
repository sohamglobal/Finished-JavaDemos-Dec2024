package com.sharayu.classes;

public class Three extends One {
	public void showDiscount(double amount)
	{
		double disc;
		disc=amount*9/100;
		System.out.println("Discount is "+disc);
	}

}
