package com.sharayu.strings;

import java.util.Scanner;

public class PasswordCheck {
	public static void main(String[] args) {
		String ops="chelsea786";
		String yps;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your password : ");
		yps=sc.nextLine();
		
		if(yps.equals(ops))
		{
			System.out.println("Welcome to Java...");
		}
		else
		{
			System.out.println("Password incorrect...");
		}
	}

}
