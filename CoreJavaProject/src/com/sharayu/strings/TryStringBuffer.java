package com.sharayu.strings;

public class TryStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("I love Java");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append(" and spring boot");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append(" and cloud platforms");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.delete(5, 40);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
	}

}
