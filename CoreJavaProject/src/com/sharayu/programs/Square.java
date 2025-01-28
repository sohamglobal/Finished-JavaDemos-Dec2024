package com.sharayu.programs;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		int n,sq;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		
		sq=n*n;
		System.out.println("Sqaure is "+sq);
		sc.close();
	}

}
