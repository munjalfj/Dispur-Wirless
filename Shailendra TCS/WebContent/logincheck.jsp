<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dispur-Wireless</title>
</head>
<body>
<% 
		if(session.getAttribute("login") != null)
		{
			boolean status = (Boolean)session.getAttribute("login");
			out.println(status);
			response.sendRedirect("index.jsp");
		}	
	%>
<h2>
	TCS Dispur-Wireless
</h2>
<h3>
	Connection Management Portal
</h3>
<form action="login.jsp">
		<table>
			<tr>
				<td>
					Login as
				</td>
			</tr>
			<tr>
				<td>
					<select id="role" name="role" required>
                        <option value="" disable selected>Select Role</option>
                        <option value="0">Relationship Manager</option>
                        <option value="1">Customer</option>
                    </select>
				</td>
			</tr>
			<tr>
				<td>
					<input type = "submit" value="Next">
				</td>
				<td>
					<input type = "reset" value="clear">
				</td>
			</tr>
			<tr>

</body>
</html>