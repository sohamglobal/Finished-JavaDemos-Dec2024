package com.ethan.classes;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStudnm().compareTo(o2.getStudnm());
	}

}
