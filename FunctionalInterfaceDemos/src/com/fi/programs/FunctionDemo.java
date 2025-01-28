package com.fi.programs;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer, String> obj=(Integer n)->{
			if(n%2==1)
				return "odd";
			else
				return "even";
		};
		System.out.println(obj.apply(9));
		System.out.println(obj.apply(26));
	}

}
