package com.sharayu.beans;

import java.util.ArrayList;
import java.sql.*;

public class EmpReporting {
	private ArrayList<Employee> emplist;
	
	public EmpReporting()
	{
		Connection con;
		Statement st;
		ResultSet rs;
		Employee emp;
		emplist=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			st=con.createStatement();
			rs=st.executeQuery("select * from employees");
			while(rs.next())
			{
				emp=new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEmpnm(rs.getString("empnm"));
				emp.setDept(rs.getString("dept"));
				emp.setPost(rs.getString("post"));
				emp.setLocation(rs.getString("location"));
				emp.setSalary(rs.getFloat("salary"));
				emplist.add(emp);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public ArrayList<Employee> getEmplist() {
		return emplist;
	}

	
	
}
