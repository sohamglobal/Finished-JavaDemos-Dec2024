package com.sharayu.strings;

public class StringFunctions {
	public static void main(String[] args) {
		String nm="sohamglobal";
		String slogan="technology is power technology is future";
		
		System.out.println(nm.charAt(5));
		
		String s1="praffull";
		String s2="sharayu";
		String s3="Praffull";
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		
		System.out.println(slogan.contains("power"));
		System.out.println(slogan.startsWith("tech"));
		System.out.println(slogan.endsWith("?"));
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(slogan.indexOf("e"));
		System.out.println(slogan.lastIndexOf("e"));
		
		String ps="";
		System.out.println("Empty? "+ps.isEmpty());
		
		System.out.println(s2.length());
		
		String res=slogan.replace("technology", "sports");
		System.out.println(res);
		
		String[] words=slogan.split(" ");
		for(String w:words)
			System.out.println(w);
		
		System.out.println(s1.substring(3, 5));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		String s5="      chelsea         ";
		System.out.println(s5.trim());
		
		int x=786;
		String y=String.valueOf(x);
		
		
	}

}
