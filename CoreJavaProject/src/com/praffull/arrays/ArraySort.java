package com.praffull.arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] arr= {9,26,13,10,1,45,3,67,33,59};
		int i,j,temp;
		
		for(i=0;i<=8;i++)
		{
			for(j=i+1;j<=9;j++)
			{
				if(arr[j]<arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int n:arr)
			System.out.print(n+" ");
		
	}

}
