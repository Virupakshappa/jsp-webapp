<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<% 
String password1 = request.getParameter("pass1");
String password2 = request.getParameter("pass2");%>
	<%if(password1.equals(password2)){
out.println("Hi!! Welcome...");
}
else{%>
	<% out.println("Password mismatch..."); %>
	<% } %>
</body>
</html>