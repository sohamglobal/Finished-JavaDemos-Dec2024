package com.praffull.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.*;

/**
 * Servlet implementation class RegisterUser
 */
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id;
		String ps,nm,mo,em;
		id=Integer.parseInt(request.getParameter("userid"));
		ps=request.getParameter("password");
		nm=request.getParameter("username");
		mo=request.getParameter("mobile");
		em=request.getParameter("emailid");
		
		Connection con;
		PreparedStatement pst;
		HttpSession ses=request.getSession(true);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			pst=con.prepareStatement("insert into users values(?,?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, ps);
			pst.setString(3, nm);
			pst.setString(4, mo);
			pst.setString(5, em);
			pst.executeUpdate();
			con.close();
			ses.setAttribute("message","User Registered Successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
			ses.setAttribute("message","Registration failed...");
		}
		
		response.sendRedirect("Registered.jsp");
	}

}
