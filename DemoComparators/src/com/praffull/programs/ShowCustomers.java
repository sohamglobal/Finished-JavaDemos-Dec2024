package com.praffull.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.ethan.classes.Customer;
import com.ethan.classes.CustomerAgeComparator;
import com.ethan.classes.CustomerNameComparator;
import com.ethan.classes.CustomerNumberComparator;

public class ShowCustomers {
	public static void main(String[] args) {
		Customer c1=new Customer(102, "jos buttler", "male", 32);
		Customer c2=new Customer(87, "mohammed salah", "male", 29);
		Customer c3=new Customer(129, "alia bhatt", "female", 33);
		Customer c4=new Customer(75, "pat cummins", "male", 31);
		Customer c5=new Customer(89, "tabassum hashmi", "female", 53);
		
		ArrayList<Customer> clist=new ArrayList<Customer>();
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		clist.add(c4);
		clist.add(c5);
		
		//System.out.println(clist);
		//Collections.sort(clist,new CustomerNameComparator());
		//Collections.sort(clist,new CustomerNumberComparator());
		Collections.sort(clist,new CustomerAgeComparator());
		
		Iterator<Customer> itr=clist.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
