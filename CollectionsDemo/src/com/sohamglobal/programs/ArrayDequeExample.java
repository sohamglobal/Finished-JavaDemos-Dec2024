package com.sohamglobal.programs;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeExample {
	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<String>();
		ad.add("java");
		ad.add("sql");
		ad.add("mongodb");
		//ad.add("java"); allowed
		//ad.add(null); not allowed
		ad.addFirst("windows");
		ad.addLast("linux");
		System.out.println(ad.removeFirst());
		
		System.out.println(ad);
		Iterator<String> itr=ad.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next().toUpperCase());
	}

}
