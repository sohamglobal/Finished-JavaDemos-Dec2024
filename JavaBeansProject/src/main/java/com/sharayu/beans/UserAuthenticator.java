package com.sharayu.beans;

import java.sql.*;

public class UserAuthenticator {
	private int userid;
	private String password;
	private String status;
	
	public UserAuthenticator()
	{
		userid=0;
		password="";
		status="";
	}

	public String getStatus() {
		checkUser();
		return status;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	private void checkUser()
	{
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			pst=con.prepareStatement("select * from users where userid=? and pswd=?");
			pst.setInt(1, userid);
			pst.setString(2, password);
			rs=pst.executeQuery();
			if(rs.next())
			{
				status="success";
			}
			else
				status="failed";
			con.close();
				
		}
		catch(Exception e)
		{
			status="error";
		}
		
	}
	
	

}
