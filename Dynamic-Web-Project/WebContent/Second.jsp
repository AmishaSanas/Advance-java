<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>getting Data </title>
</head>
<body>
 <h1>Second JSP</h1>
	<%
		String firstName = request.getParameter("FirstName");
		String lastName = request.getParameter("LastName");
		String loginid = request.getParameter("LoginId");
		String password = request.getParameter("Password");
		String Dob = request.getParameter("DOB");
		String Address = request.getParameter("Address");	
	%>
	
	<h1><%=firstName%></h1>
	<h1><%=lastName%></h1>
	<h1><%=loginid %></h1>
	<h1><%=password %></h1>
	<h1><%=Dob%></h1>
	<h1><%=Address%></h1>
	
</body>
</html>