package com.fi.programs;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<Integer> obj=(Integer age)->{
			if(age<18)
				System.out.println("cant open account");
			else
				System.out.println("welcome to netbanking");
		};
		
		obj.accept(13);
	}

}
