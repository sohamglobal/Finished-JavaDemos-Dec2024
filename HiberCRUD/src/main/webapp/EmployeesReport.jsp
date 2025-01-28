<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.hibernate.*"%>
    <%@page import="org.hibernate.cfg.*"%>
    <%@page import="org.hibernate.query.*"%>
    <%@page import="java.util.*"%>
    <%@page import="com.praffull.entities.*"%>
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
        <h1 class="display-5">Employees Report</h1>
        <hr>
        <table class="table table-bordered table-hover">
            <tr>
                <th>Number</th>
                <th>Name</th>
                <th>Department</th>
                <th>Post</th>
                <th>Location</th>
                <th>Salary</th>
            </tr>

            <%
            Configuration cfg=new Configuration().configure();
            SessionFactory sf=cfg.addAnnotatedClass(Employee.class).buildSessionFactory();
            Session ses=sf.getCurrentSession();
            ses.beginTransaction();

            Query<Employee> q=ses.createQuery("from Employee");
            List<Employee> lst=q.getResultList();
            out.println(lst.size());

            for(int i=0;i<lst.size();i++)
            {
                %>
                <tr>
                    <td><%=lst.get(i).getEmpno()%></td>
                    <td><%=lst.get(i).getEmpnm()%></td>
                    <td><%=lst.get(i).getDept()%></td>
                    <td><%=lst.get(i).getPost()%></td>
                    <td><%=lst.get(i).getLocation()%></td>
                    <td><%=lst.get(i).getSalary()%></td>
                </tr>

                <%
            }

            %>

        </table>
    </div>

</body>
</html>