package com.praffull.programs;
import java.util.*;
import java.sql.*;

public class ChangeSalary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		float newsal;
		
		Connection con;
		PreparedStatement pst;
		
		try
		{
		System.out.print("Enter employee number : ");
		no=sc.nextInt();
		System.out.print("Enter new salary : ");
		newsal=sc.nextFloat();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
		pst=con.prepareStatement("update employees set salary=? where empno=?");
		pst.setFloat(1, newsal);
		pst.setInt(2, no);
		int cnt=pst.executeUpdate();
		System.out.println("Records updated : "+cnt);
		
		if(cnt==1)
			System.out.println("salary updated successfully");
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
