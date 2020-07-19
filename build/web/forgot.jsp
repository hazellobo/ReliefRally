<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
        <script type="text/javascript" src="http://gc.kis.v2.scr.kaspersky-labs.com/E462864B-38E8-014E-9639-3082B49E1594/main.js" charset="UTF-8"></script><script type="text/javascript" src="jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="registerStyle.css">
    </head>
    <%@include file="header.jsp" %>
 
    <body>
       

         <div id="wrapper">     
             <h1>Forgot password</h1>
             <p>Please fill in the details for forgot password.</p>
             <hr>
             <form action="forgotPassword" method="post" onsubmit="return checkform(this);" class="formmargin">
                
            <div class="form-element">
                <label for="email">Email</label>  
                <input type="email" name="email" id="email" placeholder = "johnDoe@gmail.com" required>
            </div>

<div class="capbox">

<div id="CaptchaDiv"></div>

<div class="capbox-inner">
Type the above number:<br>

<input type="hidden" id="txtCaptcha">
<input type="text" name="CaptchaInput" id="CaptchaInput" size="15"><br>

</div>
</div>
<br><br>
<!-- END CAPTCHA -->

                <div class="form-element">
                       <input type="submit" id="submitButton" value="Submit">
                 </div>
                
       
            
            </form>
        </div>
        
        <script type="text/javascript">
// Captcha Script
function checkform(theform){
var why = "";

if(theform.CaptchaInput.value == ""){
why += "- Please Enter CAPTCHA Code.\n";
}
if(theform.CaptchaInput.value != ""){
if(ValidCaptcha(theform.CaptchaInput.value) == false){
why += "- The CAPTCHA Code Does Not Match.\n";
}
}
if(why != ""){
alert(why);
return false;
}
}

var a = Math.ceil(Math.random() * 9)+ '';
var b = Math.ceil(Math.random() * 9)+ '';
var c = Math.ceil(Math.random() * 9)+ '';
var d = Math.ceil(Math.random() * 9)+ '';
var e = Math.ceil(Math.random() * 9)+ '';

var code = a + b + c + d + e;
document.getElementById("txtCaptcha").value = code;
document.getElementById("CaptchaDiv").innerHTML = code;

// Validate input against the generated number
function ValidCaptcha(){
var str1 = removeSpaces(document.getElementById('txtCaptcha').value);
var str2 = removeSpaces(document.getElementById('CaptchaInput').value);
if (str1 == str2){
return true;
}else{
return false;
}
}

// Remove the spaces from the entered and generated code
function removeSpaces(string){
return string.split(' ').join('');
}

</script>

    </body>
</html>
