package com.praffull.programs;

import com.sharayu.classes.MathCalculator;

public class UseMathCalculator {
	public static void main(String[] args) {
		MathCalculator obj=new MathCalculator();
		obj.divide(23, 5);
		obj.divide(0, 12);
		//obj.divide(45, 0);
		obj.newDivide(45,0);
	}

}
