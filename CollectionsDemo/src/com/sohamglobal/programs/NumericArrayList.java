package com.sohamglobal.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class NumericArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> lst=new ArrayList<>();
		lst.add(9);
		lst.add(13);
		lst.add(26);
		lst.add(1);
		lst.add(30);
		System.out.println(lst);
		
		Iterator<Integer> itr=lst.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//lst.add(45); fail fast (ConcurrentModificationException)
		}
		
		
		ArrayList<Double> dlist=new ArrayList<>();
		dlist.add(12.34);
		dlist.add(75.29);
		System.out.println(dlist);
	}

}
