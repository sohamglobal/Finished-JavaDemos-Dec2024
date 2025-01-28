package com.praffull.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.ethan.classes.Address;
import com.ethan.classes.AddressComparator;
import com.ethan.classes.Student;
import com.ethan.classes.StudentNameComparator;

public class StudentsData {
	public static void main(String[] args) {
		Student s1=new Student(51, "charles leclerc", new Address("college road",842501));
		Student s2=new Student(52, "carlos sainz", new Address("stamford bridge",635210));
		Student s3=new Student(53, "fernando alonso", new Address("maple avenue",741045));
		Student s4=new Student(54, "max verstappen", new Address("oak street",621850));
		Student s5=new Student(55, "george russel", new Address("pine lane",809741));
		ArrayList<Student> lst=new ArrayList<Student>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		lst.add(s5);
		
		//Collections.sort(lst,new StudentNameComparator());
		Collections.sort(lst,new AddressComparator());
		Iterator<Student> itr=lst.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
