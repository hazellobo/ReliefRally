<%@include file="LoggedIn.jsp" %>
<body> 
    <h2 style="margin-top: 7% ;text-align: center;font-family: cursive"><b> HEALTH AND PERSONAL CARE</b></h2>><br><br>
    
                  <% session.setAttribute("category",request.getParameter("category"));%>

         
 
    <div class="container" style="font-family: cursive">
  
  <div class="card-deck" style="border-radius: 50px">
      <div class="card" style="border-radius: 30px;background-color: #eee">
      <div class="card-body text-center">
        <form action="donate.jsp" method="post">
          <img src="project images/medicines.jpg" alt="tshirt" width="220rem" height="230rem" style="border-radius: 20px">
        <p class="card-text"> MEDICINES</p>
        <input type="hidden" name="product" value="MEDICINES" />
        <input type="submit" value="Donate" style="border-radius: 20px">
        </form>
      </div>
      
    </div>
    
    <div class="card" style="border-radius: 30px;background-color: #eee" >
      <div class="card-body text-center">
          <form action="donate.jsp" method="post">
          <img src="project images/antiseptic.jpg" alt="trouser" width="220rem" height="230rem" style="border-radius: 20px">
        <p class="card-text">ANTISEPTICS</p>
        <input type="hidden" name="product" value="ANTISEPTICS" />
        <input type="submit" value="Donate" style="border-radius: 20px">
          </form>
      </div>
    </div>
    <div class="card" style="border-radius: 30px;background-color: #eee">
      <div class="card-body text-center">
          <form action="donate.jsp" method="post">
          <img src="project images/soap.jpg" alt="blanket" width="220rem" height="230rem" style="border-radius: 20px">
        <p class="card-text">SOAPS AND CREAMS</p>
        <input type="hidden" name="product" value="SOAPS AND CREAMS" />
        <input type="submit" value="Donate" style="border-radius: 20px">
          </form>
      </div>
    </div>
    <div class="card" style="border-radius: 30px;background-color: #eee"s>
      <div class="card-body text-center">
          <form action="donate.jsp" method="post">
          <img src="project images/shampoo.jpg" alt="sweater" width="200rem" height="230rem" style="border-radius: 20px">     
        <p class="card-text">SHAMPOOS AND HAIR CARE</p>
        <input type="hidden" name="product" value="SHAMPOOS AND HAIR CARE" />
        <input type="submit" value="Donate"  style="border-radius: 20px;">
          </form>
        <div class="sharethis-inline-follow-buttons"></div>
      </div>
    </div>  
  </div>
</div>

</body>
</html>
