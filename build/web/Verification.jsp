<%-- 
    Document   : Verification
    Created on : 23 Oct, 2018, 11:09:49 AM
    Author     : User
--%>

<%@page import="javax.ejb.EJB"%>
<%@page import="ejb.MailSenderBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verification</title>
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
        <script type="text/javascript" src="http://gc.kis.v2.scr.kaspersky-labs.com/E462864B-38E8-014E-9639-3082B49E1594/main.js" charset="UTF-8"></script><script type="text/javascript" src="jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="registerStyle.css">
    </head>
    <%@include file="header.jsp" %>

    <body>
        <form method="post" action="Verification">
            <div id="wrapper">
            <div class="form-element">
                <label for="emailid">Email</label>  
                <input type="email" name="emailid" id="emailid" required>
            </div>   
                <div class="form-element">
                       <input type="submit" id="submitButton" value="Verify">
                 </div>
                
        </form>
        <div>
    </body>
</html>
