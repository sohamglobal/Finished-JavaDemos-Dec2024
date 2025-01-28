package com.ethan.classes;

import java.util.Comparator;

public class AddressComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getAddress().compareTo(o2.getAddress());
	}

}
