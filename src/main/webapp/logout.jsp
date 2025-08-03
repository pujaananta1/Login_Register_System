<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jakarta.servlet.http.HttpSession" %>
    <!DOCTYPE html>
    <head></head>
    <body>

<%
    if (session != null) {
        session.invalidate();
    }
%>
    <h3>You have successfully logged out.</h3>
    <a href="login.jsp">Login Again</a>
</body>
</html>

