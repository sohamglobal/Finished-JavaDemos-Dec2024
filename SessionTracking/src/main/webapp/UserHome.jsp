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
        <h1 style="color:darkgreen" class="display-5">Welcome to Session tracking</h1>
        <hr>
        Account Number : <%=session.getAttribute("userid") %> 
        Name : <%=session.getAttribute("username") %>
        <br>
        SessionID : <%=session.getId()%>
        <br>
        <a href="FindBalance.jsp">Find my balance</a>
        <br>
        <a href="Logout.jsp">Logout</a>
</div>
</body>
</html>