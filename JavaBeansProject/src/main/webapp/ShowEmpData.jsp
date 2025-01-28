<%@page import="com.sharayu.beans.Employee"%>
<%@page import="com.sharayu.beans.EmpInfoGenerator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<br><br>
<h1 class="display-5">Calling Java Bean...</h1>
<hr>
<%
int eno=Integer.parseInt(request.getParameter("empNumber"));
//System.out.println(eno);
EmpInfoGenerator obj=new EmpInfoGenerator();
obj.setEmpno(eno);
Employee e=obj.getEmployee();
%>

<br>
Number : <%=e.getEmpno() %>
<br>
Name : <%=e.getEmpnm() %>
<br>
Department : <%=e.getDept() %>
<br>
Post : <%=e.getPost() %>
<br>
Location : <%=e.getLocation() %>
<br>
Salary : <%=e.getSalary() %>
<br>



</div>

</body>
</html>