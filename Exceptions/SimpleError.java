package com.praffull.programs;

import java.util.Scanner;

public class SimpleError {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double income,tax;
		
		System.out.print("Enter annual income : ");
		try
		{
		income=sc.nextDouble();
		}
		catch(Exception e)
		{
		System.out.println("invalid income value");
		income=0;
		}
		finally
		{
			System.out.println("file ITR and help the nation");
		}
		
		
		if(income<500000)
			tax=0;
		else 
			if(income>=500000 && income<750000)
				tax=income*5/100;
			else
				tax=income*8/100;
		
		System.out.println("The income tax is "+tax);
	}

}
