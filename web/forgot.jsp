<%-- 
    Document   : forgot.jsp
    Created on : 20 Sep, 2018, 11:01:00 PM
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link href="registerStyle.css" type="text/css" rel="stylesheet">
    </head>
    <body>
      <div id="wrapper"> 
 <form action="forgotServlet" method="post">
     
        
  <h1>Forgot Password</h1>
   <div class="form-element">
   <label for="email">Email</label> 
  <input type="email" name="email" placeholder="username@gmail.com" required>
   </div>
  
  <div class="form-element">
  <input  class="btn" type="submit" id="submitButton" value="SUBMIT"> 
  </div>

 </form>
</div>

        <script>
        var password = document.getElementById("password")
  , passwordConfirm = document.getElementById("passwordConfirm");

function validatePassword(){
  if(password.value !== passwordConfirm.value) {
    passwordConfirm.setCustomValidity("Passwords Don't Match");
  } else {
    passwordConfirm.setCustomValidity('');
  }
}

password.onchange = validatePassword;
passwordConfirm.onkeyup = validatePassword;
</script>
    </body>
</html>
