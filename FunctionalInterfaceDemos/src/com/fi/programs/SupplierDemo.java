package com.fi.programs;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> obj=()->{
			Calendar cal=Calendar.getInstance();
			return cal.getTime().toString();
		};
		String val=obj.get();
		System.out.println(val);
	}

}
