
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Admin.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Donaters</title>
    </head>
    <body>
        <h1>Donation Record</h1>
            <table border="1">
                <tr>
                    <th>Email</th>
                    <th>Category</th>
                    <th>Product Name</th>
                    <th>Product Description</th>
                    <th>Usage</th>
                </tr>
                <c:forEach var="donate" items="${Donate}">
                    <tr>
                        <td><c:out value="${donate.email}" /></td>
                        
                        <td><c:out value="${donate.category}" /></td> 
                        
                        <td><c:out value="${donate.pname}" /></td> 
                        
                        <td><c:out value="${donate.pdesc}" /></td>
                        
                        <td><c:out value="${donate.usage}" /></td>
                        
                    </tr>
                </c:forEach>
            </table>

    </body>
</html>