package com.praffull.arrays;

import java.util.Scanner;

public class InputIntegers {
	public static void main(String[] args) {
		int[] arr=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<=4;i++)
		{
			System.out.print("Enter a number : ");
			arr[i]=sc.nextInt();
		}
		
		for(int n:arr)
			System.out.println(n);
		
		sc.close();;
	}

}
