package com.praffull.programs;
import java.util.*;
import java.sql.*;

public class TransferMoneySP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fno,tno;
		float amt;
		String det;
		
		Connection con;
		CallableStatement cst;
		
		try
		{
		System.out.print("Enter from account number : ");
		fno=sc.nextInt();
		System.out.print("Enter to account number : ");
		tno=sc.nextInt();
		System.out.print("Enter transfer amount : ");
		amt=sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter details : ");
		det=sc.nextLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
		cst=con.prepareCall("{call transfer(?,?,?,?)}");
		cst.setInt(1, fno);
		cst.setInt(2, tno);
		cst.setFloat(3, amt);
		cst.setString(4, det);
		cst.execute();
		System.out.println("amount transferred & log maintained successfully");
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}

}
