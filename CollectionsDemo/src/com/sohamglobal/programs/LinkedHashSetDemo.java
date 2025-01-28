package com.sohamglobal.programs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("charles leclerc");
		lhs.add("max verstappen");
		lhs.add("lando norris");
		lhs.add("fernando alonso");
		lhs.add("george russel");
		//lhs.add("charles leclerc");
		//lhs.add(null);
		System.out.println(lhs);
		
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
