
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="LoggedIn.jsp"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Profile</title>
        <link href="registerStyle.css" type="text/css" rel="stylesheet">
    </head>
   <body>

 
         <div id="wrapper">     
             <h1>My Profile</h1>
             <hr>
             <form action="Update" method="post"  >
                 <div class="form-element">
                <label for="email">Email</label>  
                <input type="email" name="email" id="email" value="${Register.email}" readonly="readonly">
            </div>

                
            <div class="form-element">
                <label for="phone">Telephone</label>
                <input type="text" name="phone" id="phone" value="${Register.phone}" readonly="readonly" pattern="[789][0-9]{9}" title="Enter valid phone no." required>
            </div>
                
                 <div class="form-element">
                <label for="Fname">First Name</label>  
                <input type="text" name="fname" id="fname" value="${Register.fname}"  required>
            </div>
                  <div class="form-element">
                <label for="Lname">Last Name</label>  
                <input type="text" name="lname" id="lname" value="${Register.lname}" required>
            </div>

			<div class="form-element">
				<label for="address">Address</label>
                                <input type="text" name="address" id="address" value="${Register.address}" required>

			</div>
                                <div class="form-element">
				<label for="city">City</label>
                                <input type="text" name="city" id="city1" value="${Register.city}" required>

			</div>
                	<div class="form-element">
		<label for="state">State</label>
                <input type="text" name="state" id="state" value="${Register.state}" required>
                        </div>
                        <div class="form-element">
		<label for="points">Wallet Points</label>
                <input type="text" name="points" id="points" value="${Register.points}"  readonly="readonly" required>
                        </div>
			<div class="form-element">
                       <input type="submit" id="submitButton" value="Save">
                 </div>

		
            </form>
        </div>
</html>
