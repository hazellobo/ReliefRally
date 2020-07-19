<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customers List Page</title>
    </head>
    <body>
        <table>
            <c:forEach var="register" items="${Register}"  >
            <tr><td> First Name<td><c:out value="${register.fname}" /></td> </tr>
            <tr><td> Last Name:</td><td><c:out value="${register.lname}" /> </td> </tr>
            <tr><td> Email Id:</td><td><c:out value="${register.email}" /></td> </tr>
             <tr><td>Phone:</td><td><c:out value="${register.phone}" /></td> </tr>
              <tr><td>Address:</td><td><c:out value="${register.address}" /></td> </tr>
               <tr><td>Wallet Points:</td><td><c:out value="${register.points}" /></td> </tr>
        </c:forEach>
          
</table>
    </body>
</html>

