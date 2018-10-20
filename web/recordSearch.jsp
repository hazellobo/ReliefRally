<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Admin.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Search Page</title>
    </head>
    <body>
        <form action="CustomerSearch" method="POST">

            <table border="1">
                <tr></tr><tr></tr>
                
                    <tr>
                    <h1>Search Customer By email</h1>
                        <td> <input type="email" name="email" value="" />   </td>
                        <td> <input type="submit" value="Search" />        </td>
                    </tr>

            </table>


        </form>
    </body>
</html>
