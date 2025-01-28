package com.sharayu.programs;

import java.util.Scanner;

public class AdditionDouble {
	public static void main(String[] args) {
		double x,y,z;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		x=sc.nextDouble();
		System.out.print("Enter second number : ");
		y=sc.nextDouble();
		z=x+y;
		
		System.out.println("sum of "+x+" and "+y+" is "+z);
				
		sc.close();
	}

}
