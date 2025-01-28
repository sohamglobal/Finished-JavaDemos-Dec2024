package com.praffull.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ChangeEmpLocation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		String newloc;
		
		Connection con;
		PreparedStatement pst;
		
		try
		{
		System.out.print("Enter employee number : ");
		no=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter new location : ");
		newloc=sc.nextLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
		pst=con.prepareStatement("update employees set location=? where empno=?");
		pst.setString(1, newloc);
		pst.setInt(2, no);
		int cnt=pst.executeUpdate();
		System.out.println("Records updated : "+cnt);
		
		if(cnt==1)
			System.out.println("location updated successfully");
		else
			System.out.println("employee not found");
		
		con.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		sc.close();
	}


}
