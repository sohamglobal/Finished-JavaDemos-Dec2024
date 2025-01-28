package com.praffull.programs;
import java.util.*;
import java.sql.*;

public class SearchAccountNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.print("Enter account number to search : ");
		no=sc.nextInt();
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			pst=con.prepareStatement("select accnm,balance from accounts where accno=?");
			pst.setInt(1, no);
			rs=pst.executeQuery();
			if(rs.next())
			{
				System.out.println(rs.getString("accnm"));
				System.out.println(rs.getFloat("balance"));
			}
			else
			{
				System.out.println("account does not exist");
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		sc.close();
	}

}
