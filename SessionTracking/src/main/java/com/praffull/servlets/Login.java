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
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int uid;
		String ps;
		uid=Integer.parseInt(request.getParameter("userid"));
		ps=request.getParameter("pswd");
		System.out.println(uid+"    "+ps);
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			pst=con.prepareStatement("select usernm from users where userid=? and pswd=?");
			pst.setInt(1, uid);
			pst.setString(2, ps);
			rs=pst.executeQuery();
			if(rs.next())
			{
				
				HttpSession session=request.getSession(true);
				session.setAttribute("userid", uid);
				session.setAttribute("username", rs.getString("usernm"));
				
				response.sendRedirect("UserHome.jsp");
			}
			else
			{
				
				response.sendRedirect("Failure.jsp");
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}

}
