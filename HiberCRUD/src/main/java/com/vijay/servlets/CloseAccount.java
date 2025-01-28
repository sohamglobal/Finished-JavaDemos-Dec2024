package com.vijay.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.praffull.entities.Account;

/**
 * Servlet implementation class CloseAccount
 */
public class CloseAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CloseAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//delete from Account where accno=:ano
		int ano;
		ano=Integer.parseInt(request.getParameter("accno"));
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Account.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		Query<Account> q=ses.createQuery("delete from Account where accno=:ano");
		q.setParameter("ano", ano);
		int cnt=q.executeUpdate();
		ses.getTransaction().commit();
		ses.close();
		
		if(cnt==1)
			response.sendRedirect("AccountClosed.jsp");
		else
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("errormsg", "Account not found");
			response.sendRedirect("Error.jsp");
			
		}
		
		
	}

}
