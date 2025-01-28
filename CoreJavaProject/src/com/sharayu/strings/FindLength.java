package com.sharayu.strings;

import java.util.Scanner;

public class FindLength {
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter some string : ");
		s=sc.nextLine();
		
		if(s.isEmpty())
		{
			System.out.println("The string is empty");
		}
		else
		{
			System.out.println("Total number of characters are "+s.length());
		}
	}

}
