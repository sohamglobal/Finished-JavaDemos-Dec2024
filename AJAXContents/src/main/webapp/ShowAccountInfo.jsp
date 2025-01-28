<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">

<%
int ano=Integer.parseInt(request.getParameter("accountNumber"));
Connection con;
PreparedStatement pst;
ResultSet rs;

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
	pst=con.prepareStatement("select * from accounts where accno=?");
	pst.setInt(1,ano);
	rs=pst.executeQuery();
	if(rs.next())
	{
		out.println("Name : "+rs.getString("accnm"));
		out.println(" | Balance : "+rs.getString("balance"));
	}
	else
	{
		out.println("Account does not exist");
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