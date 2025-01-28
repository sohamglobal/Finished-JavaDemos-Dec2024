package com.praffull.programs;
import java.sql.*;

public class JoinSelect {
	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			st=con.createStatement();
			rs=st.executeQuery("select customers.custnm,cars.modelnm,cars.company,cars.price from customers left outer join cars on customers.carid=cars.carid");
			
			while(rs.next())
			{
				System.out.println(rs.getString("custnm")+" | "+rs.getString("modelnm")+" | "+rs.getString("company")+" | "+rs.getFloat("price"));
			}
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
