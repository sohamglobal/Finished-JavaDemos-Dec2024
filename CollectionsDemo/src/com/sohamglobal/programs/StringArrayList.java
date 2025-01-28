package com.sohamglobal.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StringArrayList {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("java");
		names.add("python");
		names.add("csharp");
		names.add("sql");
		names.add("java");
		System.out.println(names.size());
		System.out.println(names);
		System.out.println(names.get(3));
		names.set(4, "spark");
		System.out.println(names);
		names.remove(3);
		System.out.println(names);
		System.out.println(names.isEmpty());
		names.add(1,"cloud");
		System.out.println(names);
		
				
		for(int i=0;i<names.size();i++)
			System.out.println(names.get(i).toUpperCase());
		
		System.out.println("-----------------");
		
		for(String nm:names)
			System.out.println(nm);
		
		System.out.println("------------------");
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Collections.sort(names);
		System.out.println(names);
		
		names.clear();
	}

}
