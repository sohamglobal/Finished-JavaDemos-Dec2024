package com.sohamglobal.programs;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> st=new Stack<>();
		st.push("usa");
		st.push("england");
		st.push("japan");
		st.push(null);
		st.push("japan");
		st.push("korea");
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		
	}

}
