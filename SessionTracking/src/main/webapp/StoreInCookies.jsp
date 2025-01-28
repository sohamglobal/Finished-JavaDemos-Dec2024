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

<%
String cho=request.getParameter("choice");
Cookie c1=new Cookie("interest",cho);
//lifespan in seconds
c1.setMaxAge(45);
response.addCookie(c1);
%>

<h1 class="display-5">Data stored in cookies successfully</h1>
<hr>
<a href="index.html">Home</a>

</div>
</body>
</html>