package com.sohamglobal.programs;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(9, "praffull");
		ht.put(30, "vijay");
		ht.put(26, "shailaja");
		ht.put(13, "sharayu");
		ht.put(1, "soham");
		ht.putIfAbsent(29, "jay");
		//ht.put(null, "megha"); not allowed
		//ht.put(21, null); not allowed
		System.out.println(ht);
		
		System.out.println(ht.containsKey(26));
		System.out.println(ht.containsValue("vijay"));
		System.out.println(ht.get(13));
		System.out.println(ht.getOrDefault(15,"ethan hunt"));
		
		Iterator<Integer> itr=ht.keys().asIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Iterator<String> itr1=ht.values().iterator();
		while(itr1.hasNext())
			System.out.println(itr1.next());
		
		System.out.println("---------------------");
		
		for(Map.Entry<Integer, String> element:ht.entrySet())
			System.out.println(element);
		
		
		}

}
