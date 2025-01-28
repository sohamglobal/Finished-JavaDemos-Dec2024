package com.praffull.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.sharayu.beans.UserAuthenticator;

/**
 * Servlet implementation class Authenticate
 */
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authenticate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int userid;
		String password;
		userid=Integer.parseInt(request.getParameter("userid"));
		password=request.getParameter("password");
		UserAuthenticator ua=new UserAuthenticator();
		ua.setUserid(userid);
		ua.setPassword(password);
		String stat=ua.getStatus();
		
		if(stat.equals("success"))
		{
			HttpSession ses=request.getSession(true);
			ses.setAttribute("userid", userid);
			response.sendRedirect("UserHome.jsp");
		}
		
		if(stat.equals("failed"))
			response.sendRedirect("Failure.jsp");
		
		if(stat.equals("error"))
			response.sendRedirect("Error.jsp");
	}

}
