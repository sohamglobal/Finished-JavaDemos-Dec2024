package com.sharayu.classes;

import com.ashwini.interfaces.Bank;

public class StandardChartered implements Bank {
	
	public void welcome()
	{
		System.out.println("Welcome to Standard Chartered");
	}

	@Override
	public void calcInterest(double balance) {
		// TODO Auto-generated method stub
		double interest;
		interest=balance*6.5/100;
		System.out.println("Fixed Interest will be "+interest);
	}

	@Override
	public void showAccountTypeInfo() {
		// TODO Auto-generated method stub
		System.out.println("Interest rates at HDFC are -");
		System.out.println("Saving: 4%, Fixed: 6.5%, PPF: 8.3%");
	}
	

}
