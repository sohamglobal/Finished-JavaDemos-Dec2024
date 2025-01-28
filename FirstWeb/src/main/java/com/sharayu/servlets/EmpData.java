package com.sharayu.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.*;

/**
 * Servlet implementation class EmpData
 */
public class EmpData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Connection con;
		Statement st;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//out.println("Driver loaded successfully");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			st=con.createStatement();
			rs=st.executeQuery("select * from employees");
			
			out.println("<h2>Employee List</h2><hr>");
			while(rs.next())
			{
				out.println("<li>"+rs.getString("empnm"));
			}
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

}
