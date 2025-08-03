<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>

</head>
<body>
    <%
        // Use the implicit session object directly
        // Check if the session is valid and the username attribute is set
        if (session != null && session.getAttribute("username") != null) {
            // Get the username from the session
            String username = (String) session.getAttribute("username");
    %>
        <div class="container">
            <h1>Welcome, <%= username %>!</h1>
            <p>you can <a href="logout.jsp">LOGOUT</a> securely.</p>
        </div>
    <%
        } else {
            // Redirect to the login page if the session is not valid
            response.sendRedirect("login.jsp");
        }
    %>
</body>
</html>

</body>
</html>