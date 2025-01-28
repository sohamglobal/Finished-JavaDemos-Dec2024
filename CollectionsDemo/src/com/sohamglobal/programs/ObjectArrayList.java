package com.sohamglobal.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sohamglobal.classes.Employee;

public class ObjectArrayList {
	public static void main(String[] args) {
		//ArrayList<Employee> list=new ArrayList<>();
		List<Employee> list=new ArrayList<>();
		Employee e1=new Employee(123, "jos buttler", "marketing", "executive", "manchester", 23500);
		list.add(e1);
		Employee e2=new Employee(124, "pat cummins", "admin", "manager", "sydney", 35700);
		list.add(e2);
		
		/*
		for(int i=0;i<list.size();i++)
		{
			//System.out.println(list.get(i));
			System.out.println(list.get(i).getEmpnm()+" | "+list.get(i).getLocation());
		}
		*/
		
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			System.out.println(itr.next().getEmpnm());
		}
		
	}

}
