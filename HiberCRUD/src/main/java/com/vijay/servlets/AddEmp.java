package com.vijay.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.praffull.entities.Employee;

/**
 * Servlet implementation class AddEmp
 */
public class AddEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int empno;
		String empnm,dept,post,location;
		float salary;
		
		empno=Integer.parseInt(request.getParameter("empno"));
		empnm=request.getParameter("empnm");
		dept=request.getParameter("dept");
		post=request.getParameter("post");
		location=request.getParameter("location");
		salary=Float.parseFloat(request.getParameter("salary"));
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		Employee e=new Employee();
		e.setEmpno(empno);
		e.setEmpnm(empnm);
		e.setDept(dept);
		e.setPost(post);
		e.setLocation(location);
		e.setSalary(salary);
		
		ses.persist(e);
		ses.getTransaction().commit();
		ses.close();
		
		response.sendRedirect("index.html");
		
		
		
		
	}

}
