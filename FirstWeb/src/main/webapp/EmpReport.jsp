<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EmpReport</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
<br><br>
<h1 class="display-5">Employee Report</h1>
<hr>
<table class="table table-bordered table-hover">
<tr>
<th>Number
<th>Name
<th>Department
<th>Post
<th>Location
<th>Salary
</tr>
<%
Connection con;
Statement st;
ResultSet rs;

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
	st=con.createStatement();
	rs=st.executeQuery("select * from employees");
	while(rs.next())
	{
		%>
		<tr>
		<td><%=rs.getInt("empno") %>
		<td><%=rs.getString("empnm") %>
		<td><%=rs.getString("dept") %>
		<td><%=rs.getString("post") %>
		<td><%=rs.getString("location") %>
		<td><%=rs.getFloat("salary") %>
		</tr>
		<%
	}
	con.close();
}
catch(Exception e)
{
	out.println(e);
}

%>




</table>

</div>

</body>
</html>