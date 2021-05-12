<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4 style="color: green"><%="welcome to Ojas"%></h4>
	<%!java.text.SimpleDateFormat st = new SimpleDateFormat("dd-mm-yyyy");
	java.util.Date d = new java.util.Date();%>
	Date =<%=st.format(d)%>
	<%
	for (int i = 1; i <= 10; i++) {
	%>
	<%=i%><br>
	<%
	}
	%>
</body>
</html>