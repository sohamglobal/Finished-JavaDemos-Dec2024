package com.sohamglobal.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("london");
		hs.add("berlin");
		hs.add("mumbai");
		hs.add("tokyo");
		//hs.add("mumbai"); not maintained/stored
		//hs.add(null); is allowed
		hs.add("chicago");
		System.out.println(hs);
		System.out.println(hs.contains("hyderabad"));
		System.out.println(hs.isEmpty());
		
		
		for(String ct:hs)
			System.out.println(ct);
		
		System.out.println("---------------");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			// hs.remove("tokyo"); java.util.ConcurrentModificationException
		}
		
		List<String> lst=Arrays.asList("england","japan","france","germany");
		HashSet<String> countries=new HashSet<String>(lst);
		System.out.println(lst);
		System.out.println(countries);
	}

}
