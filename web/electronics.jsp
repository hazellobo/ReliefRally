<%@include file="LoggedIn.jsp" %>

<body> 
    <h2 style="margin-top: 7% ;text-align: center;font-family: cursive"><b> ELECTRONIC GADGETS</b></h2>><br><br>
    
    
              <% session.setAttribute("category",request.getParameter("category"));%>

 
    <div class="container" style="font-family: cursive">
  
  <div class="card-deck" style="border-radius: 50px">
      <div class="card" style="border-radius: 30px;background-color: #eee">
      <div class="card-body text-center">
                    <form action="donate.jsp" method="post">
          <img src="project images/fridge.jpg" alt="tshirt" width="220rem" height="240rem" style="border-radius: 20px">
        <p class="card-text">REFRIGERATORS</p>
        <input type="hidden" name="product" value="REFRIGERATORS" />
        <input type="submit" value="Donate" style="border-radius: 20px">
                    </form>
        
      </div>
      
    </div>
    
    <div class="card" style="border-radius: 30px;background-color: #eee" >
      <div class="card-body text-center">
                    <form action="donate.jsp" method="post">

          <img src="project images/kettle.jpg" alt="trouser" width="220rem" height="240rem" style="border-radius: 20px">
        <p class="card-text">KETTLES</p>
        <input type="hidden" name="product" value="KETTLES" />
        <input type="submit" value="Donate" style="border-radius: 20px">
                    </form>
      </div>
    </div>
    <div class="card" style="border-radius: 30px;background-color: #eee">
      <div class="card-body text-center">
                    <form action="donate.jsp" method="post">
          <img src="project images/oven.jpg" alt="blanket" width="220rem" height="240rem" style="border-radius: 20px">
        <p class="card-text">MICROWAVE-OVEN</p>
        <input type="hidden" name="product" value="MICROWAVE-OVEN" />
        <input type="submit" value="Donate" style="border-radius: 20px">
                    </form>
      </div>
    </div>
    <div class="card" style="border-radius: 30px;background-color: #eee"s>
      <div class="card-body text-center">
                    <form action="donate.jsp" method="post">
          <img src="project images/washing_mc.jpg" alt="sweater" width="200rem" height="240rem" style="border-radius: 20px">     
        <p class="card-text">WASHING MACHINE</p>
        <input type="hidden" name="product" value="WASHING MACHINE" />
        <input type="submit" value="Donate"  style="border-radius: 20px;">
                    </form>

        <div class="sharethis-inline-follow-buttons"></div>
      </div>
    </div>  
  </div>
</div>


</body>

