package com.sharayu.classes;

import com.ashwini.interfaces.Bank;

public class HDFC implements Bank {

	public void welcome()
	{
		System.out.println("Welcome to HDFC Bank");
	}

	@Override
	public void calcInterest(double balance) {
		// TODO Auto-generated method stub
		double interest;
		interest=balance*5/100;
		System.out.println("Interest will be "+interest);
		
	}

	@Override
	public void showAccountTypeInfo() {
		// TODO Auto-generated method stub
		System.out.println("Interest rates at HDFC are -");
		System.out.println("Saving: 3%, Fixed: 5%, PPF: 7.4%");
	}

	
}
