<%-- 
    Document   : purchase
    Created on : 15 Oct, 2018, 1:42:49 AM
    Author     : apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="LoggedIn.jsp" %>
        <h1> <%=(session.getAttribute("errMessage") == null) ? "" : session.getAttribute("errMessage")%></h1>
    <script> 
    
    </script>
    </body>
</html>
