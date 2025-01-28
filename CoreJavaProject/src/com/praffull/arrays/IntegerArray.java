package com.praffull.arrays;

public class IntegerArray {
	public static void main(String[] args) {
		int[] num= {9,13,10,26,1};
		int i;
		//System.out.println(num[0]);
		//System.out.println(num[3]);
		for(i=0;i<=4;i++)
			num[i]*=num[i];
		
		for(i=0;i<=4;i++)
		{
			System.out.println(num[i]);
		}
		
	}

}
