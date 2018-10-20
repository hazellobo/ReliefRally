<%-- 
    Document   : contactpage
    Created on : 15 Oct, 2018, 1:19:40 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <script src="//platform-api.sharethis.com/js/sharethis.js#property=5bb796b6cc49680011f76cba&product=sticky-share-buttons"></script>
         <link href="contactStyle.css" rel="stylesheet" type="text/css">
        
        <title>Contact Us</title>

    </head>
    <body>
         <%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%> 
        <h2 style="font-family:  cursive; font-weight: 30px">Come join us!!!!!</h2>
        <p style="font-family: cursive"> Drop us a Message</p>

<div class="container">
  <div style="text-align:center">
      <h2 style="font-family: cursive;font-weight: 30px"><b>Contact Us</b></h2>
      <p style="font-family: cursive;font-weight: 20px">Swing by for a cup of coffee, or leave us a message:</p>
  </div>
  <div class="row">
    <div class="column">
        <div id="map" style="width:50%">
            <iframe src="https://www.google.com/maps/d/embed?mid=1SPkR6SgLSx5aiS9Ua_w3mVpK77VEAOCs" width="640" height="480"></iframe>


        </div>
    </div>
    <div class="column">
        <form action="contactServlet" method="post">
            <label for="fname" style="font-family: cursive">First Name</label>
        <input type="text" id="fname" name="fname" placeholder="Your name..">
        <label for="lname" style="font-family: cursive" >Last Name</label>
        <input type="text" id="lname" name="lname" placeholder="Your last name..">
        <label for="email" style="font-family: cursive">Email Address</label> <br>
        <input type="text" placeholder="Enter email" name="email" required><br>
        <label for="country"  style="font-family: cursive">Country</label>
        <input type="text" name="country" required><br>
        <label for="subject" style="font-family: cursive">Subject</label>
        <textarea id="subject" name="subject" placeholder="Write something.." style="height:170px"></textarea>
        <input type="submit" value="Submit">
        <div class="sharethis-inline-follow-buttons"></div>

      </form>
    </div>
  </div>
</div>
       


    </body>
</html>
