package com.praffull.programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.ashwini.classes.Customer;

public class SerializeCustomer {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Customer c=new Customer();
		c.setCustid(1234);
		c.setCustnm("tom cruise");
		c.setGender("male");
		c.setAge(64);
		c.setCity("new york");
		c.setMobile("7391966656");
		
		ObjectOutputStream objout=new ObjectOutputStream(new FileOutputStream("cust"));
		objout.writeObject(c);
		
		System.out.println("Customer Object is serialized...");
		objout.close();
		
	}

}
