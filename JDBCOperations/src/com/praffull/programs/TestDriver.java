package com.praffull.programs;

public class TestDriver {
	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("JDBC Driver loaded successfully");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("failed to load the JDBC Driver");
		}
	}

}
