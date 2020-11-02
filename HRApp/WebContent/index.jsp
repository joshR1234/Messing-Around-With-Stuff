<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="cogent.hr.app.domain.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>A Test Page</title>
</head>
<body>
	<h1> Cogent University </h1>
	<%
		Employee e=(Employee) request.getAttribute("employee");	
	%>
	Hello <b> <%=e.getName()%> ,</b> We at Cogent are welcoming you
	<p> Here are your details:</p>
	<table border="1">
	<th>EMP ID</th> 	<th>NAME</th> 	<th>SALARY</th> 	<th>DEPT ID</th>
	<tr>
	<td><%=e.getId()%></td> <td> <%=e.getName()%></td> <td><%=e.getSalary()%></td> 	<td><%=e.getDeptId()%></td>
	</tr>
	</table>
	
	
	
	
</body>
</html>