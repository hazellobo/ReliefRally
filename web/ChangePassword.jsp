<%@page import="java.sql.Statement"%>
<%@page import="model.DBconnect"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
         <link href="registerStyle.css" type="text/css" rel="stylesheet">
    </head>
   <body>
       
        <%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%>

         <div id="wrapper">     
             <h1>Reset Password</h1>
             <hr>
             <form action="ChangePassword" method="post">         
            <div class="form-element">
                <label for="email">Email</label>  
                <input type="email" name="email" id="email" value="<%=session.getAttribute("email")%>" readonly="readonly" required>
            </div>
             <div class="form-element">
                <label for="oldPass">Old Password</label>
                <input type="password" name="oldPass" required>
            </div>

                <div class="form-element">
                <label for="newPass">New Password</label>
                <input type="password" name="newPass" id="newPass" onkeyup="validatePassword(this.value);"/><span id="msg"></span>
            </div>

            <div class="form-element">
                <label for="confirm">Confirm Password</label>
                <input type="password" name="confirm" id="confirm" required>
            </div>
           
                 
            <div class="form-element">
                       <input type="submit" id="submitButton" value="Save">
                 </div>
                
            </form>
        </div>
</html>
        
        <script>
            var newPass = document.getElementById("newPass")
  , confirm = document.getElementById("confirm");

function validatePassword(){
  if(newPass.value !== confirm.value) {
    confirm.setCustomValidity("Passwords Don't Match");
  } else {
    confirm.setCustomValidity('');
  }
}

newPass.onchange = validatePassword;
confirm.onkeyup = validatePassword;

        </script>
    </body>
</html>
