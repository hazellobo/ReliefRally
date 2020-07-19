
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Admin.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Purchase</title>
    </head>
    <body>
        <h1>Purchase History</h1>
            <table border="1">
                <tr>
                    <th>Email</th>
                    <th>Voucher Name</th>
                </tr>
                <c:forEach var="pur" items="${pur}">
                    <tr>
                        <td><c:out value="${pur.email}" /></td>
                        
                        <td><c:out value="${pur.vname}" /></td> 
                    </tr>
                </c:forEach>
            </table>

    </body>
</html>