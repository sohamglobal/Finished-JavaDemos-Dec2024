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
 * Servlet implementation class RegisterEmp
 */
public class RegisterEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int no;
		String nm,dp,po,lo;
		float sl;
		
		Connection con;
		PreparedStatement pst;
		
		no=Integer.parseInt(request.getParameter("eno"));
		nm=request.getParameter("enm");
		dp=request.getParameter("dep");
		po=request.getParameter("pos");
		lo=request.getParameter("loc");
		sl=Float.parseFloat(request.getParameter("sal"));
		
		System.out.println(no+"  "+nm+"  "+dp+"  "+po+"  "+lo+"  "+sl);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			pst=con.prepareStatement("insert into employees values(?,?,?,?,?,?)");
			pst.setInt(1, no);
			pst.setString(2, nm);
			pst.setString(3, dp);
			pst.setString(4, po);
			pst.setString(5, lo);
			pst.setFloat(6, sl);
			pst.executeUpdate();
			out.println("<h2>new employee added successfully</h2><hr>");
			out.println("<a href='index.html'>Home</a>");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			out.println("New employee insert failed");
		}
		
		
	}

}
