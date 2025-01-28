package com.sharayu.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
/**
 * Servlet implementation class PerformTransact
 */
public class PerformTransact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PerformTransact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int no;
		String typ;
		float amt;
		
		Connection con;
		PreparedStatement pst;
		
		no=Integer.parseInt(request.getParameter("accountNumber"));
		typ=request.getParameter("transactionType");
		amt=Float.parseFloat(request.getParameter("amount"));
		
		System.out.println(no+"  "+typ+"  "+amt);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			if(typ.equals("deposit"))
				pst=con.prepareStatement("update accounts set balance=balance+? where accno=?");
			else
				pst=con.prepareStatement("update accounts set balance=balance-? where accno=?");
			
			pst.setInt(2, no);
			pst.setFloat(1, amt);
			int cnt=pst.executeUpdate();
			if(cnt==1)
				System.out.println("account updated...");
			else
				System.out.println("account number not found");
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}

}
