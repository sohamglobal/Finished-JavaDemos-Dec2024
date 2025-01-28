package com.sharayu.programs;

import java.util.Scanner;

public class TryWhile {
	public static void main(String[] args) {
		int n=0,sq;
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.print("Enter a number ");
			n=sc.nextInt();
			sq=n*n;
			System.out.println("Square is "+sq);
		}
		while(n!=0);
		sc.close();
	}

}
