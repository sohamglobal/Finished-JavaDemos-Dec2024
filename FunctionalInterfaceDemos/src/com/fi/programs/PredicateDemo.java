package com.fi.programs;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<String> obj=(String password)->{
			if(password.equals("chelsea"))
				return true;
			else
				return false;
		};
		System.out.println(obj.test("spider"));
	}

}
