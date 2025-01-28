<%@page import="jakarta.persistence.NoResultException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.hibernate.*"%>
    <%@page import="org.hibernate.cfg.*"%>
    <%@page import="org.hibernate.query.*"%>
    <%@page import="com.praffull.entities.*"%>
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
        <h1 class="display-5">Search Result</h1>
        <hr>
        <%
        int no=Integer.parseInt(request.getParameter("accountNumber"));

        Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.addAnnotatedClass(Account.class).buildSessionFactory();
        Session ses=sf.getCurrentSession();
        ses.beginTransaction();

        Query<Account> q=ses.createQuery("from Account where accno= :ano");
        q.setParameter("ano",no);
        
        
        try
        {
        Account obj=q.getSingleResult();
        %>
        <span style="color:darkgreen">
            Number : <%=no%>
            <br>
            Name : <%=obj.getAccnm()%>
            <br>
            Type : <%=obj.getAcctype()%>
            <br>
            Balance : <b><%=obj.getBalance()%></b>
            <br>
            

        </span>
        
        <%
        }
        catch(NoResultException e)
        {
        	out.println("Account Not Found");
        }
        
        
        ses.close();
                %>
<br>
<a href="index.html">Home</a>
    </div>

</body>
</html>