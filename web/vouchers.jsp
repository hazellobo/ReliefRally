<!DOCTYPE html>
<html lang="en">
<head>
  <title>electronics</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <link href="clothesStyle.css" rel="stylesheet" type="text/css">
</head>
<body> 
    <%@include file="LoggedIn.jsp" %>
    <p>
    <h2 style="margin-top: 10% ;text-align: center;font-family: cursive;color: blue"><b></b>HURRY UP!!!!!! AND GRAB OUT OUR AMAZING VOUCHERS </h2>><br><br>
    
                <%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%>

    <div class="container" style="font-family: cursive">
     
  <div class="card-deck" style="border-radius: 50px;width: 140rem">
      
      
      <div class="card" style="border-radius: 30px;background-color: lavender">
      <div class="card-body text-center">
        <form action="PurchaseServlet" method="post">
          <img src="project images/gift1.jpg" alt="tshirt" width="300rem" height="180rem" style="border-radius: 20px">
        <p class="card-text">Buy a McDonald's voucher worth Rs100 for 250 points </p>
        <input type="hidden" name="voucher" value="McDonald's voucher worth Rs100" />
        <input type="hidden" name="points" value="250" />
        <input type="submit" name="submit"  value="Redeem" class="btn btn-primary" />
        </form>
      </div>
    </div>
    
          <div class="card" style="border-radius: 30px;background-color:lavender" >
      <div class="card-body text-center">
          <form action="PurchaseServlet" method="post">
          <img src="project images/gift3.png" alt="tuser" width="300rem" height="180rem" style="border-radius: 20px">
        <p class="card-text">Grab an Amazon Voucher with extra 5% off on every purchase for 150 points</p>
        <input type="hidden" name="voucher" value="Amazon Voucher with extra 5% off on every purchase" />
        <input type="hidden" name="points" value="150" />
        <input type="submit" name="submit"  value="Redeem" class="btn btn-primary" />
          </form>
      </div>
    </div>
      
      
    <div class="card" style="border-radius: 30px;background-color:lavender">
      <div class="card-body text-center">
          <form action="PurchaseServlet" method="post">
          <img src="project images/gift2.jpg" alt="blanket" width="300rem" height="180rem" style="border-radius: 20px">
        <p class="card-text"> Grab a Big Bazaar Voucher worth Rs250 for 400 points</p>
        <input type="hidden" name="voucher" value="Big Bazaar Voucher worth Rs250" />
        <input type="hidden" name="points" value="400" />
        <input type="submit" name="submit"  value="Redeem" class="btn btn-primary" />
          </form>
      </div>
    </div>
      <br>
      <div class="card" style="border-radius: 30px;background-color: lavender">
      <div class="card-body text-center">
          <form action="PurchaseServlet" method="post">
          <img src="project images/gift5.jpg" alt="blanket" width="300rem" height="180rem" style="border-radius: 20px">
        <p class="card-text"> Grab a Big Bazaar Voucher worth Rs500 for 750 points </p>
        <input type="hidden" name="voucher" value="Big Bazaar Voucher worth Rs500" />
        <input type="hidden" name="points" value="750" />
        <input type="submit" name="submit"  value="Redeem" class="btn btn-primary" />
          </form>
      </div>
    </div>
      <div class="card" style="border-radius: 30px;background-color: lavender">
      <div class="card-body text-center">
          <form action="PurchaseServlet" method="post">
          <img src="project images/gift6.jpg" alt="blanket" width="300rem" height="180rem" style="border-radius: 20px">
        <p class="card-text"> Grab a Myntra Voucher worth Rs700 for 1500 points </p>
        <input type="hidden" name="voucher" value="Myntra Voucher worth Rs700" />
        <input type="hidden" name="points" value="1500" />
        <input type="submit" name="submit"  value="Redeem" class="btn btn-primary" />
          </form>
      </div>
    </div>
      
      
    <div class="card" style="border-radius: 30px;background-color: lavender"s>
      <div class="card-body text-center">
          <form action="PurchaseServlet" method="post">
          <img src="project images/gift4.jpg" alt="sweater" width="300rem" height="180rem" style="border-radius: 20px">  
          
        <p class="card-text">Get amazing vouchers worth Rs1000 from AMAZON for 3000 points</p>
        <input type="hidden" name="voucher" value="Amazon Voucher worth Rs1000" />
        <input type="hidden" name="points" value="3000" />
        <input type="submit" name="submit"  value="Redeem" class="btn btn-primary" />
          </form>
      </div>
    </div>  
  </div>
        
</div>

       
</p>
       <script>

        $(document).ready(function(){
    $('.card-deck').hover(
            //trigger when mouse hover
            function(){
                $(this).animate({
                    margin-top:"-=1%",
                },200);
                           
            },
       
       //trigger when mouse hover
       function(){
                $(this).animate({
                    margin-top:"0%",
                },200);
            }
                );
});
        
       
    </script>
    
</body>
</html>
