package com.sharayu.beans;
import java.sql.*;

public class BalanceFinder {
	private int accountNumber;
	private String accountName;
	private String accountType;
	private float balance;
	
	public BalanceFinder()
	{
		accountNumber=0;
		accountName="Not found";
		accountType="Not found";
		balance=0;
	}

	public float getBalance() {
		return balance;
	}


	public String getAccountName() {
		return accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
		retrieveData();
	}
	
	
	private void retrieveData()
	{
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			pst=con.prepareStatement("select * from accounts where accno=?");
			pst.setInt(1, accountNumber);
			rs=pst.executeQuery();
			if(rs.next())
			{
				accountName=rs.getString("accnm");
				accountType=rs.getString("acctype");
				balance=rs.getFloat("balance");
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			balance=-1;
		}
	}
	
	

}
