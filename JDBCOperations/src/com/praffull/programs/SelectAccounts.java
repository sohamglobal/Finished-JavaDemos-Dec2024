package com.praffull.programs;
import java.sql.*;

public class SelectAccounts {
	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			st=con.createStatement();
			rs=st.executeQuery("select accnm,balance from accounts where balance>75000");
			
			while(rs.next())
			{
				System.out.print(rs.getString("accnm")+" | ");
				System.out.println(rs.getFloat(2));
				
			}
			con.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
