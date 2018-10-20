<%@include file="LoggedIn.jsp" %>
<title>What to donate</title>
<body> 
    <h2 style="margin-top: 10% ;text-align: center;font-family: cursive"><b> HERE'S A GLIMPSE OF WHAT YOU CAN DONATE...</b></h2>><br><br>
    
    
 
<div class="container">
  
  <div class="card-deck" style="border-radius: 50px;font-family: cursive">
      <div class="card" style="border-radius: 30px;background-color: #eee">
      <div class="card-body text-center">
          
          <form action="electronics.jsp" method="post">
          <img src="project images/dp1.jpg" alt="tshirt" width="220rem" height="230rem" style="border-radius: 20px">
          <p class="card-text">ELECTRONIC GADGETS<br>
            Points:100
          </p>
        <input type="hidden" name="category" value="elec" />
        <input type="submit" name="submit"  value="View More Items" class="btn btn-primary" />
          </form>
      </div>
      
    </div>
    
    <div class="card" style="border-radius: 30px;background-color: #eee" >
      <div class="card-body text-center">
          <form action="clothes.jsp" method="post">
          <img src="project images/dp2.jpg" alt="trouser" width="220rem" height="230rem" style="border-radius: 20px">
          <p class="card-text">CLOTHING AND MATTRESSES<br>
           Points:50
          </p> 
        <input type="hidden" name="category" value="clothes" />
        <input type="submit" name="submit"  value="View More Items" class="btn btn-primary" />
          </form>
      </div>
    </div>
      
    <div class="card" style="border-radius: 30px;background-color: #eee">
      <div class="card-body text-center">
          <form action="health.jsp" method="post">
          <img src="project images/dp3.jpg" alt="blanket" width="220rem" height="230rem" style="border-radius: 20px">
          <p class="card-text">HEALTH AND PERSONAL CARE<br>
          Points:40
          </p>
        <input type="hidden" name="category" value="health" />
        <input type="submit" name="submit"  value="View More Items" class="btn btn-primary" />
          </form>
      </div>
    </div>
      
    <div class="card" style="border-radius: 30px;background-color: #eee"s>
      <div class="card-body text-center">
          <form action="books.jsp" method="post">
          <img src="project images/dp4.jpg" alt="sweater" width="200rem" height="230rem" style="border-radius: 20px">     
          <p class="card-text">BOOKS AND STATIONARY <br>
          Points:25
          </p>
        
        <input type="hidden" name="category" value="books" />
        <input type="submit" name="submit"  value="View More Items" class="btn btn-primary" />
          </form>
      </div>
    </div>  
  </div>
</div>
</body>
