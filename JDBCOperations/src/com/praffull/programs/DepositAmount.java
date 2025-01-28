package com.praffull.programs;
import java.util.*;
import java.sql.*;

public class DepositAmount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		float amt;
		Connection con;
		PreparedStatement pst;
		
		try
		{
			System.out.println("DEPOSIT AMOUNT");
			System.out.println("---------------------------");
		System.out.print("Enter account number : ");
		no=sc.nextInt();
		System.out.print("Enter amount : ");
		amt=sc.nextFloat();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
		pst=con.prepareStatement("update accounts set balance=balance+? where accno=?");
		pst.setFloat(1, amt);
		pst.setInt(2, no);
		int cnt=pst.executeUpdate();
		if(cnt==1)
			System.out.println("balance updated successfully");
		else
			System.out.println("account number not found");
		
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		sc.close();
	}

}
