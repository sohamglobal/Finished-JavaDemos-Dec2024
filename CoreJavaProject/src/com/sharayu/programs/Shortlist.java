package com.sharayu.programs;

import java.util.Scanner;

public class Shortlist {
	public static void main(String[] args) {
		int age,exp;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter age ");
		age=sc.nextInt();
		System.out.print("Enter experience in months ");
		exp=sc.nextInt();
		
		if(age<30 && exp>24)
		{
			System.out.println("Congrats");
			System.out.println("you are shortlisted for interview");
		}
		else
		{
			System.out.println("sorry");
			System.out.println("not eligible for this job..try other postings");
		}
		
		sc.close();
	}

}
