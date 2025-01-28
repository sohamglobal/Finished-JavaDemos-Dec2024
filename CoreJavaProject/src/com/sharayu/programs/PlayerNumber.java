package com.sharayu.programs;

import java.util.Scanner;

public class PlayerNumber {
	public static void main(String[] args) {
		int jno;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter jersey number ");
		jno=sc.nextInt();
		
		switch(jno)
		{
		case 63:
			System.out.println("Jos Buttler");
			break;
		case 66:
			System.out.println("Joe Root");
			break;
		case 11:
			System.out.println("Mohammed Salah");
			break;
		case 9:
			System.out.println("Robert Lewandowski");
			break;
		case 17:
			System.out.println("Kevin De Bruyne");
			break;
		default:
			System.out.println("information not found");
		}
		sc.close();	
	}

}
