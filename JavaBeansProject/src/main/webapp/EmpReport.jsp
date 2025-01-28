<%@page import="com.sharayu.beans.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sharayu.beans.EmpReporting"%>
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
<h1 class="display-5">Employee Report ArrayList</h1>
<hr>
<%
EmpReporting obj=new EmpReporting();
ArrayList<Employee> list=obj.getEmplist();
out.println("Records retrieved : "+list.size());
for(int i=0;i<list.size();i++)
{
	out.println("<li>"+list.get(i).getEmpnm()+" | "+list.get(i).getSalary());
}
%>

</div>

</body>
</html>