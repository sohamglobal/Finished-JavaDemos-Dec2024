package com.sohamglobal.programs;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		//PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Comparator.reverseOrder());
		pq.add(23);
		pq.add(75);
		pq.add(9);
		pq.add(13);
		//pq.add(null); 
		pq.add(45);
		pq.offer(75);
		System.out.println(pq);
		//insertion sequence is not maintained
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println("--------------------------");
		
		Iterator<Integer> itr=pq.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
