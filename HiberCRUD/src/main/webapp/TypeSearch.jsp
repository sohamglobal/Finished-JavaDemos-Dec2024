<%@page import="java.util.List"%>
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

    <table class="table table-bordered table-hover">
        <tr>
            <th>Number</th>
            <th>Name</th>
            <th>Type</th>
            <th>Balance</th>
        </tr>

<%
Configuration cfg=new Configuration().configure();
SessionFactory sf=cfg.addAnnotatedClass(Account.class).buildSessionFactory();
Session ses=sf.getCurrentSession();
ses.beginTransaction();

String typ=request.getParameter("acctype");

Query<Account> q=ses.createQuery("from Account where acctype= :type");
q.setParameter("type",typ);

List<Account> lst=q.getResultList();
out.println("Accounts Found : "+lst.size());
ses.close();

for(int i=0;i<lst.size();i++)
{
%>
	<tr>
        <td><%=lst.get(i).getAccno() %></td>
        <td><%=lst.get(i).getAccnm() %></td>
        <td><%=lst.get(i).getAcctype() %></td>
        <td><%=lst.get(i).getBalance() %></td>
    </tr>
	<%
}
%>


        
    </table>

</div>


</body>
</html>