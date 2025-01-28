package com.praffull.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmps {
	public static void main(String[] args) {
		Employee e1=new Employee("soham", "liverpool", 75000);
		Employee e2=new Employee("shailaja", "dubai", 43000);
		Employee e3=new Employee("praffull", "london", 69000);
		
		List<Employee> lst=new ArrayList<Employee>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		
		System.out.println(lst);
		Collections.sort(lst,new NameComparator());
		System.out.println(lst);
		
		Collections.sort(lst,new SalaryComparator());
		System.out.println(lst);
	}

}
