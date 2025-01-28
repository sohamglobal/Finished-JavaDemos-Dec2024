package com.praffull.programs;
import java.sql.*;

public class ApplyInterest {
	public static void main(String[] args) {
		Connection con;
		CallableStatement cst;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			cst=con.prepareCall("{call addinterest()}");
			cst.execute();
			System.out.println("Interest applied...All balances updated...");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
