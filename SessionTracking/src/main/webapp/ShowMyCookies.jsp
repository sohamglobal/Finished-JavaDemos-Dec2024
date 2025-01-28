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
<h1 class="display-5">Now showing your cookies</h1>
<hr>
<%
Cookie c[]=request.getCookies();
if(c!=null)
{
	for(int i=0;i<c.length;i++)
	{
		out.println("<br>Name : "+c[i].getName());
		out.println(" | Value : "+c[i].getValue());
		
		if(c[i].getValue().equals("cricket"))
		{
			%>
			<br>
			<iframe width="560" height="315" src="https://www.youtube.com/embed/MnbSq16fezE?si=DQJkVfdpNyErCErT" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
			<%
		}
		if(c[i].getValue().equals("football"))
		{
			%>
			<br>
			<iframe width="560" height="315" src="https://www.youtube.com/embed/93b5AHi6i0Q?si=LVBabp9-RI46B0BP" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
			<%
		}
		if(c[i].getValue().equals("formula1"))
		{
			%>
			<br>
			<iframe width="560" height="315" src="https://www.youtube.com/embed/o8ezVPko3-s?si=pyE1Z0Vhi_OlYieP" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
			<%
		}
		
	}
}
else
	out.println("No cookies found on the client browser");

%>

<hr>
<a href="index.html">Home</a>
</div>

</body>
</html>