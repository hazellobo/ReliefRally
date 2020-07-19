<%-- 
    Document   : viewRecords
    Created on : 14 Oct, 2018, 9:14:55 PM
    Author     : User
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Admin.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Records</title>
    </head>
    <body>
        <h1>Customer Records</h1>
            <table border="1">
                <tr>
                    <th>Fname</th>
                    <th>Lname</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Address</th>
                    <th>City</th>
                    <th>State</th>
                    <th>Points</th>
                </tr>
                <c:forEach var="register" items="${Register}">
                    <tr>
                        <td><c:out value="${register.fname}" /></td>
                        
                        <td><c:out value="${register.lname}" /></td> 
                        
                        <td><c:out value="${register.email}" /></td> 
                        
                        <td><c:out value="${register.phone}" /></td>
                        
                        <td><c:out value="${register.address}" /></td>
                        
                        <td><c:out value="${register.city}" /></td>
                        
                        <td><c:out value="${register.state}" /></td>
                           
                        <td><c:out value="${register.points}" /></td>
                    </tr>
                </c:forEach>
            </table>

    </body>
</html>