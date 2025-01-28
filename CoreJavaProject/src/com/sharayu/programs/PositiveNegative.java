package com.sharayu.programs;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		
		if(n!=0)
		{
			if(n>0)
				System.out.println("Number is Positive");
			else
				System.out.println("Number is Negative");
		}
		else
			System.out.println("Number is Zero");
		
		sc.close();
		}

}
