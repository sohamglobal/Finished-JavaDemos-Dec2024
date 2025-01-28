package com.praffull.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.ashwini.classes.Customer;

public class CustomerDeserialize {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream objin=new ObjectInputStream(new FileInputStream("cust"));
		Customer cs=(Customer) objin.readObject();
		cs.showCustomerInfo();
	}

}
