package com.sohamglobal.programs;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(13, "java");
		tm.put(9, "Spring");
		tm.put(5, "hibernate");
		tm.put(11, "jpa");
		tm.put(3, "jdbc");
		//tm.put(null, "servlet");
		tm.put(19, null);
		System.out.println(tm);
	}

}
