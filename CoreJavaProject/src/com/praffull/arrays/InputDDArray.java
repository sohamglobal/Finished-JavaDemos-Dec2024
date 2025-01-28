package com.praffull.arrays;

import java.util.Scanner;

public class InputDDArray {
	public static void main(String[] args) {
		int[][] arr=new int[3][4];
		int i,j;
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=3;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}

}
