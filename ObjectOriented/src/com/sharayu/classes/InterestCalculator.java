package com.sharayu.classes;

public class InterestCalculator {
	private double amount;
	private double interest;
	
	public InterestCalculator()
	{
		amount=0.0;
		interest=0.0;
	}
	
	public double getInterest() {
		interest=amount*5/100;
		return interest;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
