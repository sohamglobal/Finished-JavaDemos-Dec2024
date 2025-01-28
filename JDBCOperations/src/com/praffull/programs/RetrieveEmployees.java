package com.praffull.programs;
import java.sql.*;

public class RetrieveEmployees {
	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			st=con.createStatement();
			rs=st.executeQuery("select * from employees");
			
			while(rs.next())
			{
				System.out.print(rs.getString("empnm")+" | ");
				System.out.println(rs.getFloat("salary"));
			}
			
			System.out.println("Employee data retrieved successfully");
			con.close();
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

}
