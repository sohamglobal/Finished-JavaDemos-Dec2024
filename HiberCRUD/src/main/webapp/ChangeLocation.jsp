<%@page import="org.hibernate.query.Query"%>
<%@page import="com.praffull.entities.Employee"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
<br><br>
<h1 class="display-5">Changing location...</h1>
<hr>
<%
int no;
String newloc;
no=Integer.parseInt(request.getParameter("empNumber"));
newloc=request.getParameter("location");

Configuration cfg=new Configuration().configure();
SessionFactory sf=cfg.addAnnotatedClass(Employee.class).buildSessionFactory();
Session ses=sf.getCurrentSession();
ses.beginTransaction();


Query<Employee> q=ses.createQuery("update Employee set location= :location where empno=:empno");
q.setParameter("location",newloc);
q.setParameter("empno",no);

int cnt=q.executeUpdate();
ses.getTransaction().commit();
ses.close();

if(cnt==1)
{
	%>
	<span style="color:rgb(2, 86, 2)">
		Employee location has successfully changed to <%=newloc%>
	</span>
	<%
}
else
{
	%>
	<span style="color:rgb(129, 11, 11)">
		Failed!!! Employee does not exist.
	</span>
	<%
}

%>
<br>
<a href="index.html">Home</a>

</div>
</body>
</html>