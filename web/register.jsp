<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
        <script type="text/javascript" src="http://gc.kis.v2.scr.kaspersky-labs.com/E462864B-38E8-014E-9639-3082B49E1594/main.js" charset="UTF-8"></script><script type="text/javascript" src="jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="registerStyle.css">
    </head>
    
 
    <body>
        <%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%>

         <div id="wrapper">     
             <h1>Register</h1>
             <p>Please fill in this form to create an account.</p>
             <hr>
             <form action="RegServlet" method="post" onsubmit="return checkform(this);" class="formmargin">
                
                 <div class="form-element">
                <label for="Fname">First Name</label>  
                <input type="text" name="fname" id="fname" required>
            </div>
                  <div class="form-element">
                <label for="Lname">Last Name</label>  
                <input type="text" name="lname" id="lname" required>
            </div>
            <div class="form-element">
                <label for="email">Email</label>  
                <input type="email" name="email" id="email" placeholder = "johnDoe@gmail.com" required>
            </div>

                
            <div class="form-element">
                <label for="phone">Telephone</label>
                <input type="text" name="phone" id="phone" placeholder = "9876543210" pattern="[789][0-9]{9}" title="Enter valid phone no." required>
            </div>

                <div class="form-element">
                <label for="password">Password</label>
                <input type="password" name="password" id="password"  pattern=".{6,}" title="Password Strength: Weak" onkeyup="validatePassword(this.value);"/><span id="msg"></span>
            </div>

            <div class="form-element">
                <label for="passwordConfirm">Confirm Password</label>
                <input type="password" name="passwordConfirm" id="passwordConfirm" required>
            </div>

			<div class="form-element">
				<label for="address">Address</label>
                                <input type="text" name="address" id="address" placeholder="Enter address" required>

			</div>
                	<div class="form-element">
		<label for="state">State</label>
                <input type="text" name="state" id="state" placeholder="Enter State" required>
			</div>
            

			<div class="form-element">
				<label for="city">City</label>
                                <input type="text" name="city" id="city1" placeholder="Enter City" required>

			</div>
                <hr>
                <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <!-- START CAPTCHA -->
<br>
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
                       <input type="submit" id="submitButton" value="Sign Up">
                 </div>
                
               <div class="container signin">
                <p>Already have an account? <a href="login.jsp">Sign in</a>.</p>
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
