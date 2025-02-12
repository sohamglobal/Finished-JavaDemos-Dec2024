package com.praffull.programs;

import java.util.Scanner;

public class UserEntry {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.print("Enter age : ");
		try
		{
		age=sc.nextInt();
		
		if(age>=18 && age<=60)
			System.out.println("Entry allowed...");
		else
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("Entry disallowed");
		}
	}

}
