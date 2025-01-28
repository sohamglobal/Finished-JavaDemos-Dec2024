package com.sharayu.programs;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		String nm;
		int mks;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter student name : ");
		nm=sc.nextLine();
		System.out.print("Enter marks out of 100 : ");
		mks=sc.nextInt();
		
		if(mks>=35)
		{
			System.out.println("Congrats "+nm+" you are pass");
		    System.out.println("You can take next level of the test");
		}
		else
			System.out.println("Sorry "+nm+" you are fail");
		
		sc.close();
		
	}

}
