package com.praffull.programs;
import java.util.*;
import java.sql.*;

public class NewEmployee {
	public static void main(String[] args) {
		int no;
		String nm,dp,po,lo;
		float sal;
		Scanner sc=new Scanner(System.in);
		
		Connection con;
		PreparedStatement pst;
		
		System.out.print("Enter employee number : ");
		no=sc.nextInt();
		sc.nextLine(); // to skip
		System.out.print("Enter name : ");
		nm=sc.nextLine();
		System.out.print("Enter department : ");
		dp=sc.nextLine();
		System.out.print("Enter post : ");
		po=sc.nextLine();
		System.out.print("Enter location : ");
		lo=sc.nextLine();
		System.out.print("Enter salary : ");
		sal=sc.nextFloat();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			pst=con.prepareStatement("insert into employees values(?,?,?,?,?,?)");
			pst.setInt(1, no);
			pst.setString(2, nm);
			pst.setString(3, dp);
			pst.setString(4, po);
			pst.setString(5, lo);
			pst.setFloat(6, sal);
			pst.executeUpdate();
			System.out.println("New employee inserted successfully");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
		
	}

}
