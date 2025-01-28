package com.sohamglobal.programs;

import java.util.Iterator;
import java.util.LinkedList;

public class TryLinkedList {
	public static void main(String[] args) {
		LinkedList<String> llist=new LinkedList<>();
		llist.add("microsoft");
		llist.add("oracle");
		llist.add("vmware");
		llist.add(null);
		llist.add("volkswagen");
		llist.add("oracle");
		llist.add(2,"skoda");
		System.out.println(llist);
		
		for(int i=0;i<llist.size();i++)
		{
			System.out.println(llist.get(i));
		}
		
		System.out.println("---------------------");
		
		llist.addFirst("sohamglobal");
		llist.addLast("spider projects one");
		
		Iterator<String> itr=llist.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------");
		llist.push("dell");
		System.out.println(llist.pop());
		System.out.println(llist);
		
	}

}
