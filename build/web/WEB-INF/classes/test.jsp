<%-- 
    Document   : test
    Created on : Jun 4, 2019, 8:18:37 PM
    Author     : X-SLAYER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        if(session.getAttribute("username")==null)
        {
            response.sendRedirect("login.jsp");
        }
     %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome${username}</h1>
    </body>
</html>
