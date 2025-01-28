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

import com.praffull.entities.Employee;

/**
 * Servlet implementation class IncrementSalary
 */
public class IncrementSalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncrementSalary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//update Employee set salary=salary+:inc where dept=:dep
		String dept;
		float incamt;
		dept=request.getParameter("department");
		incamt=Float.parseFloat(request.getParameter("incrementAmount"));
		
		Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.addAnnotatedClass(Employee.class).buildSessionFactory();
        Session ses=sf.getCurrentSession();
        ses.beginTransaction();
        
        Query<Employee> q=ses.createQuery("update Employee set salary=salary+:inc where dept=:dep");
        q.setParameter("inc", incamt);
        q.setParameter("dep", dept);
        int cnt=q.executeUpdate();
        ses.close();
        
        if(cnt>0)
        {
        	response.sendRedirect("SalaryUpdated.jsp");
        	
        }
        else
        {
        	HttpSession session=request.getSession(true);
			session.setAttribute("errormsg", "Salary updation failed");
			response.sendRedirect("Error.jsp");
        }
        
	}

}
