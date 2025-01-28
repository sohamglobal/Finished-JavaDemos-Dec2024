package com.praffull.programs;
import com.sharayu.classes.*;

public class Salary {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.calcSalary(13900);
		e.showSalary();
		
		System.out.println("-----------------------");
		
		Employee e2=new Employee("Microsoft");
		e2.calcSalary(34700);
		e2.showSalary();
		
		System.out.println("-----------------------");
		Employee e3=new Employee(25800);
		e3.showSalary();
	}

}
