package com.sharayu.programs;

import java.util.Scanner;

public class Capital {
	public static void main(String[] args) {
		String coun;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter country : ");
		coun=sc.nextLine();
		
		switch(coun)
		{
		case "england":
			System.out.println("Capital is London");
			break;
		case "france":
			System.out.println("Capital is Paris");
			break;
		case "germany":
			System.out.println("Capital is Berlin");
			break;
		case "pakistan":
			System.out.println("Capital is Islamabad");
			break;
		case "italy":
			System.out.println("Capital is Rome");
			break;
		default:
			System.out.println("information not available");
			
		}
		sc.close();
	}

}
