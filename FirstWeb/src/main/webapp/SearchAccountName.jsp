<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>search</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
<br><br>
<h2 class="display-5" style="color:steelblue">Search Result</h2>
<hr>
<%
String nm;
nm=request.getParameter("unm");
%>
Information for Account Name : <%=nm%>

<%
Connection con;
PreparedStatement pst;
ResultSet rs;

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
	pst=con.prepareStatement("select * from accounts where accnm=?");
	pst.setString(1,nm);
	rs=pst.executeQuery();
	while(rs.next())
	{
		out.println("<br> Type : "+rs.getString("acctype"));
		out.println("<br> Balance : "+rs.getFloat("balance"));
	}
	con.close();
}
catch(Exception e)
{
	out.println(e);
}
%>

</div>

</body>
</html>