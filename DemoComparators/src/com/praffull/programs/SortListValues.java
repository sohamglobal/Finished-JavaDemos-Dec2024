package com.praffull.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListValues {
	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>(); 
		lst.add("java");
		lst.add("spring");
		lst.add("hibernate");
		lst.add("jpa");
		lst.add("jdbc");
		lst.add("rest api");
		
		Collections.sort(lst);
		System.out.println(lst);
		
		
	}

}
