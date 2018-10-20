<%-- 
    Document   : login
    Created on : 21 Sep, 2018, 8:26:41 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <script src='https://www.google.com/recaptcha/api.js'></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="login.css">
        <meta charset="UTF-8">

 </head>
   <body>    
       
           <div class="container">
        <img src="img3.png" alt="Login"/>
            <form action="LogServlet" method="post">
                <div class="form_input">
                    
                    <input type="text" name="email" placeholder="Enter Email" required />
                </div>   
                
                <div class="form_input">
                    
                    <input type="password" name="password" placeholder="Enter Password" required />
                </div>
                
                <button type="submit" class="login_btn">Login</button>
                
                <button type="reset" class="cancel_btn">Reset</button>
                
                
            </form>
        <br/>
            <a href="register.jsp">New Member?Sign Up</a>
            <a href="forgot.jsp">Forgot Password?</a>
           </div>
       <div class="wrapper">
       <span style="color:red"><%=(request.getAttribute("errMessage") == null) ? ""
               + "" : request.getAttribute("errMessage")%></span>
          </div>
    </body>
</html>

</html>
