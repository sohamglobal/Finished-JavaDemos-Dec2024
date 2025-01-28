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
 * Servlet implementation class OpenAccount
 */
public class OpenAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OpenAccount() {
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
		
		int accno;
		String accnm,acctype;
		float balance;
		
		Connection con;
		PreparedStatement pst;
		
		accno=Integer.parseInt(request.getParameter("accountNumber"));
		accnm=request.getParameter("accountName");
		acctype=request.getParameter("accountType");
		balance=Float.parseFloat(request.getParameter("balance"));
		
		System.out.println(accno+"  "+accnm+"  "+acctype+"  "+balance);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			pst=con.prepareStatement("insert into accounts values(?,?,?,?)");
			pst.setInt(1, accno);
			pst.setString(2, accnm);
			pst.setString(3, acctype);
			pst.setFloat(4, balance);
			pst.executeUpdate();
			out.println("<h2>Account opened successfully</h2><hr>");
			con.close();
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
	}

}
