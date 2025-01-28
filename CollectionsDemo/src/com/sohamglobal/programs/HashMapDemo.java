package com.sohamglobal.programs;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("england","london");
		hm.put("usa", "washington");
		hm.put("germany", "berlin");
		hm.put("italy", "rome");
		hm.putIfAbsent("usa", "new york");
		hm.put(null, "tokyo");
		hm.put("russia",null );
		
		System.out.println(hm);
		
		for(Map.Entry<String, String> element:hm.entrySet())
			System.out.println(element);
	}

}
