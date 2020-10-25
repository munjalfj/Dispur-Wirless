<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="HeaderFooterStyle.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="navbar">
		<center><h1 style="color: orange">Dispur-Wireless</h1></center>
  		<a href="index.jsp">Home</a>
  		<a href="PlanController?operation=plandetails">Plan</a>
  		<a href="SubscriptionController?operation=subscriptiondetails">MySubscription</a>
  		<a href="LoginController" style="float:right">Logout</a>
  		<a href="#" style="float:right">Welcome ${sessionScope.username }</a>
	<div class="footer">
  		<p>Copyright @2020 Dispur Wireless. All rights are reserved.</p>
	</div>
</div>
</body>
</html>