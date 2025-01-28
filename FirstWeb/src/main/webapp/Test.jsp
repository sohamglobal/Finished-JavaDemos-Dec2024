<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TestJSP</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
<br><br>
<h2 class="display-5" style="color:steelblue">My First JSP</h2>
<hr>
<%
String nm="praffull";
String ct="london";
%>
Thank you so much <%out.println(nm);%> for using JSP from <%=ct%>, 
another serverside programming tool in Java.
<br><br>
<%
String gender="female";

if(gender.equals("female"))
{
out.println("Good bye Ms."+nm);
%>
<br>
<iframe width="560" height="315" src="https://www.youtube.com/embed/AU-hut9lGQ4?si=pOCHYW4RX2cwH-Hl" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
<%
}
else
{
out.println("Good bye Mr."+nm);
%>
<br>
<iframe width="560" height="315" src="https://www.youtube.com/embed/oJUvTVdTMyY?si=05qgaeF4Pnip44O5" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
<%
}
%>

</div>
</body>
</html>