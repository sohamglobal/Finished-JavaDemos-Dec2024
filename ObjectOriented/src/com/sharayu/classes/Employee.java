package com.sharayu.classes;

public class Employee {
	private double netsalary;
	
	public Employee()
	{
		netsalary=0.0;
		System.out.println("Welcome to SohamGlobal");
	}
	
	public Employee(String offincenm)
	{
		netsalary=0.0;
		System.out.println("Welcome to "+offincenm);
	}
	
	public Employee(double basic)
	{
		netsalary=basic;
		System.out.println("allowance, incentives and tax not applicable");
	}
	public void calcSalary(double basic)
	{
		double allowance,incentive,tax;
		allowance=basic*45/100;
		incentive=basic*30/100;
		tax=basic*4/100;
		netsalary=basic+allowance+incentive-tax;
	}
	
	public void showSalary()
	{
		System.out.println("Net salary will be "+netsalary);
	}
	

}
