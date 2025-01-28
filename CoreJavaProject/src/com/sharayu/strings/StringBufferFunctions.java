package com.sharayu.strings;

public class StringBufferFunctions {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("you will never walk alone");
		sb.ensureCapacity(100);
		System.out.println(sb);
		System.out.println("capacity "+sb.capacity());
		System.out.println("length "+sb.length());
		
		sb.delete(5, 9);
		sb.deleteCharAt(15);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer txt=new StringBuffer("technology is future");
		txt.insert(14, "your ");
		System.out.println(txt);
		
		
		sb=new StringBuffer("you will never walk alone");
		System.out.println(sb);
		
		sb.replace(15, 19, "talk");
		System.out.println(sb);
		
		
	}

}
