package com.sharayu.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpInfoGenerator {
	
	private int empno;
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
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
			pst=con.prepareStatement("select * from employees where empno=?");
			pst.setInt(1, empno);
			rs=pst.executeQuery();
			if(rs.next())
			{
				employee=new Employee();
				employee.setEmpno(empno);
				employee.setEmpnm(rs.getString("empnm"));
				//System.out.println(rs.getString("empnm"));
				employee.setDept(rs.getString("dept"));
				employee.setPost(rs.getString("post"));
				employee.setLocation(rs.getString("location"));
				employee.setSalary(rs.getFloat("salary"));
			}
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
