<%@include file="LoggedIn.jsp" %>

<body> 
                  <% session.setAttribute("category",request.getParameter("category"));%>

    <h2 style="margin-top: 7% ;text-align: center;font-family: cursive"><b> BOOKS AND OTHER STATIONARY ITEMS</b></h2>><br><br>
    
    
         
 
    <div class="container" >
  
  <div class="card-deck" style="border-radius: 50px;font-family: cursive;border-width: 150rem">
      <div class="card" style="border-radius: 30px;background-color: #eee">
      <div class="card-body text-center">
                            <form action="donate.jsp" method="post">

          <img src="project images/notebook.jpg" alt="tshirt" width="220rem" height="230rem" style="border-radius: 20px">
        <p class="card-text"> NOTEBOOKS AND PENS</p>
        <input type="hidden" name="product" value="NOTEBOOKS AND PENS" />
        <input type="submit" value="Donate" style="border-radius: 20px">
                            </form>
      </div>
      
    </div>
    
    <div class="card" style="border-radius: 30px;background-color: #eee" >
      <div class="card-body text-center">
                              <form action="donate.jsp" method="post">

          <img src="project images/textbooks.jpg" alt="trouser" width="220rem" height="230rem" style="border-radius: 20px">
        <p class="card-text">TEXTBOOKS AND STORY BOOKS</p>
        <input type="hidden" name="product" value="TEXTBOOKS AND STORY BOOKS" />
        <input type="submit" value="Donate" style="border-radius: 20px">
                              </form>
      </div>
    </div>
    <div class="card" style="border-radius: 30px;background-color: #eee">
      <div class="card-body text-center">
                              <form action="donate.jsp" method="post">

          <img src="project images/drawing.jpg" alt="blanket" width="220rem" height="230rem" style="border-radius: 20px">
        <p class="card-text">CREATIVITY ITEMS</p>
        <input type="hidden" name="product" value="CREATIVITY ITEMS" />
        <input type="submit" value="Donate" style="border-radius: 20px">
                              </form>
      </div>
    </div>
    <div class="card" style="border-radius: 30px;background-color: #eee"s>
      <div class="card-body text-center">
                              <form action="donate.jsp" method="post">

          <img src="project images/bags.jpg" alt="sweater" width="200rem" height="230rem" style="border-radius: 20px">     
        <p class="card-text">SCHOOL BAGS</p>
        <input type="hidden" name="product" value="SCHOOL BAGS" />
        <input type="submit" value="Donate" style="border-radius: 20px">
                              </form>
      </div>
    </div>  
  </div>
</div>

</body>

