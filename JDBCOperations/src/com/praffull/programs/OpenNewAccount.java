package com.praffull.programs;
import java.util.*;
import java.sql.*;

public class OpenNewAccount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		String nm,ty;
		float bl;
		
		Connection con;
		PreparedStatement pst;
		
		System.out.print("Enter account number : ");
		no=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name : ");
		nm=sc.nextLine();
		System.out.print("Enter account type : ");
		ty=sc.nextLine();
		System.out.print("Enter balance : ");
		bl=sc.nextFloat();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			pst=con.prepareStatement("insert into accounts values(?,?,?,?)");
			pst.setInt(1, no);
			pst.setString(2, nm);
			pst.setString(3, ty);
			pst.setFloat(4, bl);
			pst.executeUpdate();
			System.out.println("Account for "+nm+" opened successfully");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}

}
