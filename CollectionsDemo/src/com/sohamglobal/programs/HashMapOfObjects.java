package com.sohamglobal.programs;

import java.util.HashMap;

import com.sohamglobal.classes.Employee;

public class HashMapOfObjects {
	public static void main(String[] args) {
		Employee e1=new Employee(123, "jos buttler", "marketing", "executive", "manchester", 23500);
		Employee e2=new Employee(124, "pat cummins", "admin", "manager", "sydney", 35700);
		Employee e3=new Employee(125, "steve smith", "sales", "manager", "kolkata", 51700);
		
		HashMap<Integer, Employee> ohm=new HashMap<Integer, Employee>();
		ohm.put(1, e1);
		ohm.put(2, e2);
		ohm.put(3, e3);
		
		System.out.println(ohm);
		
		System.out.println(ohm.values());
		
		
		
	}

}
