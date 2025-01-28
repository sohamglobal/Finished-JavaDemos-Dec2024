<%@page import="com.praffull.entities.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.hibernate.*" %>
    <%@page import="org.hibernate.cfg.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int empno=0;
String empnm,dept,post,location;
float salary;

try
{
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
catch(Exception e)
{
	HttpSession ses=request.getSession(true);
	ses.setAttribute("errormsg", "Cant insert duplicate employee number "+empno);
	
	System.out.println(e);
	response.sendRedirect("Error.jsp");
}


%>

</body>
</html>