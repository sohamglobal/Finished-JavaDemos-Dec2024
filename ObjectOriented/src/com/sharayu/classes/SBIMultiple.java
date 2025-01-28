package com.sharayu.classes;

import com.ashwini.interfaces.Bank;
import com.ashwini.interfaces.Finance;

public class SBIMultiple implements Bank,Finance {

	@Override
	public double findLoanAmount(double annualincome) {
		// TODO Auto-generated method stub
		double loanamt;
		loanamt=(annualincome-(annualincome*30/100))*5;
		System.out.println("The maximum loan you can get is "+loanamt);
		return loanamt;
	}

	@Override
	public void findEMI(double loanamt, int months) {
		// TODO Auto-generated method stub
		double emi=(loanamt+(loanamt*13/100))/months;
		System.out.println("Your monthly installment for amount "+loanamt+" and months "+months+" will be "+emi);
	}

	@Override
	public void showFinanceInfo() {
		// TODO Auto-generated method stub
		System.out.println("SBI offers loans for following purpose -");
		System.out.println("Home : 7%, Car: 11%, Education: 14%");
	}

	@Override
	public void calcInterest(double balance) {
		// TODO Auto-generated method stub
		double interest;
		interest=balance*2/100;
		System.out.println("Interest will be "+interest);
	}

	@Override
	public void showAccountTypeInfo() {
		// TODO Auto-generated method stub
		System.out.println("Interest rates at SBI are -");
		System.out.println("Saving: 2%, Fixed: 3%, PPF: 4%");
	}

}
