package com.sohamglobal.programs;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("microsoft");
		ts.add("apple");
		ts.add("volkswagen");
		ts.add("samsung");
		ts.add("oracle");
		//ts.add("volkswagen"); not stored
		//ts.add(null); not allowed
		System.out.println(ts);
		
		Iterator<String> itr=ts.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
