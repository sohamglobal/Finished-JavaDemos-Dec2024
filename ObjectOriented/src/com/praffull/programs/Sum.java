package com.praffull.programs;

import com.sharayu.classes.Addition;

public class Sum {
	public static void main(String[] args) {
		Addition a=new Addition();
		a.calcSum(9, 13, 10);
		a.showSum();
		
		a.calcSum(34, 56);
		a.showSum();
	}

}
