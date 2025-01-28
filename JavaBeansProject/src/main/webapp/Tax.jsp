<%@page import="com.sharayu.beans.Taxation"%>
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
<h1 class="display-5">Taxation support</h1>
<hr>
<%
String nm=request.getParameter("name");
float inc=Float.parseFloat(request.getParameter("income"));
Taxation obj=new Taxation();
obj.setIncome(inc);
float tax=obj.getTax();
%>

Name : <%=nm%>
<br>
Annual Income : <%=inc%>
<br>
<span style="color:green;font-weight:bold">
Income tax : <%=tax %>
</span>
</div>
</body>
</html>