package com.praffull.programs;

import com.sharayu.classes.InterestCalculator;

public class FindInterest {
	public static void main(String[] args) {
		InterestCalculator ic=new InterestCalculator();
		ic.setAmount(75000);
		System.out.println(ic.getInterest());
	}

}
