<%@page import="com.sharayu.beans.BalanceFinder"%>
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
int ano=Integer.parseInt(request.getParameter("accountNumber"));
BalanceFinder obj=new BalanceFinder();
obj.setAccountNumber(ano);
float bal=obj.getBalance();
%>

Account Number : <%=ano %>
<br>
Name : <%=obj.getAccountName()%>
<br>
Type : <%=obj.getAccountType()%>
<br>
Balance : <%=bal%>


</div>

</body>
</html>