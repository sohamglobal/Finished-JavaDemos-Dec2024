<%@page import="org.hibernate.query.Query"%>
<%@page import="com.praffull.entities.Account"%>
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
<h1 class="display-5">Updating balance...</h1>
<hr>
<%
int no;
float amt;

no=Integer.parseInt(request.getParameter("accountNumber"));
amt=Float.parseFloat(request.getParameter("amount"));

Configuration cfg=new Configuration().configure();
SessionFactory sf=cfg.addAnnotatedClass(Account.class).buildSessionFactory();
Session ses=sf.getCurrentSession();
ses.beginTransaction();

Query<Account> q=ses.createQuery("update Account set balance=balance+ :amount where accno= :accno");
q.setParameter("amount",amt);
q.setParameter("accno",no);

int cnt=q.executeUpdate();
ses.getTransaction().commit();
ses.close();

String msg="";
if(cnt==1)
	msg="Balance updated successfully";
else
	msg="deposit failed..check the account number";
%>

Status : <%=msg%>
<br>
<a href="index.html">Home</a>
</div>
</body>
</html>