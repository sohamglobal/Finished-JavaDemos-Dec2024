package com.praffull.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoReduce {
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(9,26,30,13,1);
		int sum=lst.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		
		Optional<Integer> mx=lst.stream().reduce(Integer::max);
		System.out.println(mx);
		mx.ifPresent(value->System.out.println("Max : "+value));
		
		Optional<Integer> mn=lst.stream().reduce(Integer::min);
		System.out.println(mn);
		mn.ifPresent(value->System.out.println("Max : "+value));
		
		int product=lst.stream().reduce(1,(a,b)->a*b );
		System.out.println("Multiplication :"+product);
		
		List<Integer> res=lst.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(res);
	}

}
