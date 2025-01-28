<%@page import="com.sharayu.beans.AllFilmsList"%>
<%@page import="com.sharayu.beans.Film"%>
<%@page import="java.util.ArrayList"%>
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
<h1 class="display-5">Films Report</h1>
<hr>
<%
ArrayList<Film> list;
AllFilmsList obj=new AllFilmsList();
list=obj.getFlist();
//out.println(list);
%>

<table class="table table-bordered table-hover">

<%
for(int i=0;i<list.size();i++)
{
	%>
	<tr>
	<td><%=list.get(i).getFilmid() %>
	<td><%=list.get(i).getFilmname() %>
	<td><%=list.get(i).getRelyear() %>
	<td><%=list.get(i).getGenre() %>
	<td><%=list.get(i).getLanguage() %>
	<td><%=list.get(i).getImdbrating() %>
	</tr>
	<%
}
%>


</table>


</div>
</body>
</html>