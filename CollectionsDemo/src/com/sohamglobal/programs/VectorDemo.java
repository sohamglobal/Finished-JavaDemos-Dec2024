package com.sohamglobal.programs;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> vec=new Vector<>();
		vec.add("mumbai");
		vec.add("london");
		vec.add("sydney");
		vec.add("tokyo");
		vec.add(null);
		vec.add("mumbai");
		vec.addElement("new york");
		vec.insertElementAt("dubai", 1);
		System.out.println(vec);
		
		System.out.println(vec.get(3));
		
		Enumeration<String> en=vec.elements();
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
		
		
		
	}

}
