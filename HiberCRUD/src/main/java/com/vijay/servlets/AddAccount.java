package com.vijay.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.praffull.entities.Account;

/**
 * Servlet implementation class AddAccount
 */
public class AddAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int accno;
		String accnm,acctype;
		float balance;
		
		try 
		{
		accno=Integer.parseInt(request.getParameter("accno"));
		accnm=request.getParameter("accnm");
		acctype=request.getParameter("acctype");
		balance=Float.parseFloat(request.getParameter("balance"));
		
		//System.out.println(accno+"  "+accnm+"  "+acctype+"  "+balance);
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Account.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		Account obj=new Account();
		obj.setAccno(accno);
		obj.setAccnm(accnm);
		obj.setAcctype(acctype);
		obj.setBalance(balance);
		
		ses.persist(obj);
		ses.getTransaction().commit();
		ses.close();
		
		response.sendRedirect("AccountOpened.jsp");
		}
		catch(Exception e)
		{
			HttpSession ses=request.getSession(true);
			ses.setAttribute("errormsg", e.getMessage());
			
			System.out.println(e);
			response.sendRedirect("Error.jsp");
		}
	}

}
