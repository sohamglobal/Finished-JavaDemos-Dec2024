package com.praffull.arrays;

public class Searching {
	public static void main(String[] args) {
		int[] arr= {9,26,13,10,1,45,3,67,33,59};
		int i,sno=45;
		
		for(i=0;i<=9;i++)
		{
			if(arr[i]==sno)
				System.out.println("found at "+i);
		}
		
	}

}
