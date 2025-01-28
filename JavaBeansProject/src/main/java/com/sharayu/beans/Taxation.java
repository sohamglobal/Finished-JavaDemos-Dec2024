package com.sharayu.beans;

public class Taxation {
	private float income;
	private float tax;
	
	public float getTax() {
		return tax;
	}
	public void setIncome(float income) {
		this.income = income;
		calcTax();
	}
	
	private void calcTax()
	{
		if(income>750000)
			tax=income*5/100;
		else
			tax=0;
	}
	
	

}
