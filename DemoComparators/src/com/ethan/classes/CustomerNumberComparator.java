package com.ethan.classes;

import java.util.Comparator;

public class CustomerNumberComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getCustno()-o2.getCustno();
	}

}
