package com.praffull.programs;
import java.sql.*;

public class TestConnectivity {
	public static void main(String[] args) {
		Connection con;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			System.out.println("DB connectivity with AWS mumbai server successful...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to load the JDBC Driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in DB connectivity or SQL communication");
		}
		
	}

}
