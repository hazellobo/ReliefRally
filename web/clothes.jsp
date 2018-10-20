<%@include file="LoggedIn.jsp" %>

<body> 
                  <% session.setAttribute("category",request.getParameter("category"));%>

     <h2 style="margin-top: 7% ;text-align: center;font-family: cursive"><b>CLOTHING AND MATTRESSES </b></h2>><br><br>
    
         
 
     <div class="container" style="font-family: cursive">
  
  <div class="card-deck" style="border-radius: 50px">
      <div class="card" style="border-radius: 30px;background-color: #eee">
      <div class="card-body text-center">
                            <form action="donate.jsp" method="post">

          <img src="project images/tshirt.jpg" alt="tshirt" width="200rem" height="230rem" style="border-radius: 20px">
        <p class="card-text">T-SHIRTS and TROUSERS</p>
        <input type="hidden" name="product" value="T-SHIRTS and TROUSERS" />
        <input type="submit" value="Donate" style="border-radius: 20px">
                            </form>
      </div>
      
    </div>
    
    <div class="card" style="border-radius: 30px;background-color: #eee" >
      <div class="card-body text-center">
                              <form action="donate.jsp" method="post">

          <img src="project images/BEDSHEET.jpg" alt="trouser" width="200rem" height="230rem" style="border-radius: 20px">
        <p class="card-text">BEDSHEETS and MATTRESSES</p>
        <input type="hidden" name="product" value="BEDSHEETS and MATTRESSES" />
        <input type="submit" value="Donate" style="border-radius: 20px">
                              </form>
      </div>
    </div>
    <div class="card" style="border-radius: 30px;background-color: #eee">
      <div class="card-body text-center">
                              <form action="donate.jsp" method="post">

          <img src="project images/blanket.jpg" alt="blanket" width="200rem" height="230rem" style="border-radius: 20px">
        <p class="card-text">BLANKETS</p>
        <input type="hidden" name="product" value="BLANKETS" />
        <input type="submit" value="Donate" style="border-radius: 20px">
                              </form>
      </div>
    </div>
    <div class="card" style="border-radius: 30px;background-color: #eee"s>
      <div class="card-body text-center">
                              <form action="donate.jsp" method="post">

          <img src="project images/sweater.jpg" alt="sweater" width="200rem" style="border-radius: 20px">     
        <p class="card-text">SWEATERS and SHAWLS</p>
        <input type="hidden" name="product" value="SWEATERS and SHAWLS" />
        <input type="submit" value="Donate"  style="border-radius: 20px;">
                              </form>
        <div class="sharethis-inline-follow-buttons"></div>
      </div>
    </div>  
  </div>
</div>

</body>

