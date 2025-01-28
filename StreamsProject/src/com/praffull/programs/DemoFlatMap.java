package com.praffull.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFlatMap {
	public static void main(String[] args) {
		List<List<String>> lst=Arrays.asList(
				Arrays.asList("england","london"),
				Arrays.asList("germany","berlin"),
				Arrays.asList("japan","tokyo")
				);
		
		System.out.println(lst);
		
		List<String> flatlist=lst.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println(flatlist);
	}

}
