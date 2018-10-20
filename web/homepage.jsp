<%-- 
    Document   : homepage
    Created on : 23 Sep, 2018, 9:43:56 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donation Site</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="font-awesome-4.7_1.0\css\font-awesome.css" rel="stylesheet">
        <link href="font-awesome-4.7_1.0\css\font-awesome.min.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="homeStyle.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <header>
     <div class="row">
         <ul class="main-nav">
            <li>
			<a href="homepage.jsp">
			  <div class="logo">
                <img src="image2.jpeg">
              </div>
			</a></li>
             <li> <a href="">Home</a> </li>
             <li> <a href="#">About Us</a> </li>
             <li> <a href="#">Testimonials</a></li>
             <li> <a href="contactpage.jsp">Contact Us</a></li>
            <li> <a href="login.jsp">Sign In</a></li>
            <li> <a href="register.jsp">Register</a></li>
         </ul>

         
     </div>
       
	   <div class="hello">            
            <h1><b>Let's Donate for a cause</b></h1>
            <div class="button-awesome">
            <a href="" class="btn btn-half">Show me more</a>
            <a href="" class="btn btn-full">What can you Donate?</a>
            <a href="" class="btn btn-hal">Wanna Join Us?</a>
            </div>
    
        </div>
   
 </header>
    <section class="features">
        <h3 class="text-center"><b>Together We Can<b></h3>
        <p class="copy">CauseVox is a community-driven fundraising platform designed to help you grow giving and build a community of supporters activated for your nonprofit’s cause.</p>
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <i class="fa fa-handshake-o"></i>
                    
                      
                    <h4><b><a href="#">Donation Tiers</a></b></h4>
                       
                    <p class="arranging">Everything you need to rally your supporters, reach new donors, and raise more online in today’s connected world.Offer your donors the option to cover transaction fees.                       
                    </p>
                    </div>
                      
                
                
                <div class="col-md-3">
                    <i class="fa fa-money"></i>
                    <h4><b><a href="#">Flexible Funding</a></b></h4>
                    <p class="arranging">Keep what you raise even if you don’t reach your fundraising goal.Equip groups to fundraise through a team-based page.
                    </p>
                </div> 
                
                <div class="col-md-3">
                    <i class="fa fa-gift "></i>
                    <h4><b><a href="#">Recurring Donations</a></b></h4>
                    <p class="arranging">Accept & manage recurring gifts within your campaigns.Setup tiers of giving related to impact to encourage donors to give more.
                    </p>
                </div> 
                
                <div class="col-md-3">
                    <i class="fa fa-camera-retro"></i>
                    <h4><b><a href="#">Blog & Impact Updates.</a></b></h4>
                    <p class="arranging">Fuel your campaign with stories and timely impact updates.Integrate your social media accounts to make sharing easy
                    </p>
                </div>
            </div>
            
            
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
       <li data-target="#myCarousel" data-slide-to="3"></li>
        <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
          <img src="d5.JPG" alt="" style="width:100% ">
      </div>

      <div class="item">
          <img src="d3.jpg" alt="" style="width:100%;">
      </div>
    
      <div class="item">
          <img src="d2.JPG" alt="" style="width:100%;">
      </div>
        <div class="item">
            <img src="d4.JPG" alt=""  style="width:100%;">
      </div>
        <div class="item">
          <img src="d1.JPG" alt="" style="width:100%;">
      </div>
	   <div class="item">
          <img src="https://www.cpb.org/sites/default/files/spotlights/Diverse_kids_reading-D_0.jpg" alt="" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
        </div>
		<br>
		  
                          
    </section>
    </body>
</html>
