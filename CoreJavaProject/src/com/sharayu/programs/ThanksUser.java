package com.sharayu.programs;
import java.util.*;

public class ThanksUser {
	public static void main(String[] args) {
		String nm;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your name ");
		nm=sc.nextLine();
		
		System.out.println("Thanks "+nm+" for joining us");
		sc.close();
	}

}
