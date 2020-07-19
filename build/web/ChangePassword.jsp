
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Change Password</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
        <script type="text/javascript" src="http://gc.kis.v2.scr.kaspersky-labs.com/E462864B-38E8-014E-9639-3082B49E1594/main.js" charset="UTF-8"></script><script type="text/javascript" src="jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="registerStyle.css">
    </head>
    <%@include file="LoggedIn.jsp" %>
 

<body>
    
        <%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%>
       <div id="wrapper"> 
           <h1>Reset Password</h1>
           <p>  Fill the form given  below to change the password :</p>
    
            <form action="ChangePasswordServlet" method="post" class="formmargin" >
                 <div class="form-element">
                 <label for="email">Email</label>  
                <input type="text" name="email" value="<%=session.getAttribute("email")%>" readonly="readonly"><br><br>
                 </div>
                 <div class="form-element">
                     <label for="oldpassword">Old Password</label>  
                      <input type="password" name="oldpassword" required><br><br>
                 </div>
                 <div class="form-element">
                     <label for="New Password">New Password</label>  
                       <input type="password" name="newpassword" pattern=".{6,}" title="Password Strength: Weak" required><br><br>
                 </div>
                 <div class="form-element">
                <input type="submit" value="Submit" id="submitButton">
                 </div>
            </form>
       </div>   
   
</body>
</html>

