<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creating table </title>
</head>
<body>
<form action="Second.jsp">
		<table>
			<tr>
				<th>First Name</th>
				<td><input type="text" name="FirstName"
					placeholder="Enter First Name here"></td>
			</tr>
			
			<tr>
				<th>Last Name</th>
				<td><input type="text" name="LastName"
					placeholder="Enter Last Name here"></td>
			</tr>
			
			<tr>
			<th>LoginId</th>
				<td><input type="email" name="LoginId"
					placeholder="ENTER LoginId here"></td>
			</tr>
			
			<tr>
				<th>Password</th>
				<td><input type="password" name="Password" 
				placeholder="Enter Password here"></td>
				</tr>
				
			<tr>
				<th>DOB</th>
				<td><input type="date" name="DOB" 
				placeholder="Enter DOB here"></td>
				</tr>
				
			<tr>
			   <th>Address</th>
			   <td><input type="text" name="Address" 
			      placeholder="Enter Address here"></td>
				</tr>
				
			<tr>
			    <th></th>
				<td><input type = "submit"></td>
				</tr>
		</table>
	</form>
</body>
</html>