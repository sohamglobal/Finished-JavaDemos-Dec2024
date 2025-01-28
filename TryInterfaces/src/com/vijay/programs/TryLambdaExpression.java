package com.vijay.programs;

import com.praffull.interfaces.Sports;

public class TryLambdaExpression {
	public static void main(String[] args) {
		//Style-3 Lambda expression
		//interface must have a single abstract method
		
		Sports obj=(String nm)-> {
			return nm+" is not fully fit to play";
		};
		
		System.out.println(obj.showFitness("darwin nunez"));
	}

}
