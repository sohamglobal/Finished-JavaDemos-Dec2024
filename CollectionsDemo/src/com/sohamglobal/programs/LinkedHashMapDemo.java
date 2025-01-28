package com.sohamglobal.programs;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>();
		lhm.put(17, "Hyderabad");
		lhm.put(23, "kolkata");
		lhm.put(1,"amritsar");
		lhm.put(7, "patiala");
		lhm.put(19,"shimla");
		System.out.println(lhm);
		lhm.put(22, "mumbai");
		System.out.println(lhm);
	}

}
