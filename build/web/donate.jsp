<%-- 
    Document   : donate
    Created on : 13 Oct, 2018, 1:17:47 PM
    Author     : apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donate</title>
                <link rel="stylesheet" type="text/css" href="registerStyle.css">

    </head>
    <body>
                      <% session.setAttribute("product",request.getParameter("product"));%>

                <%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%>

                 <div id="wrapper">     

        <h1>Donate away!</h1>
        
        <form action="DonateServlet" method="post" onsubmit="" class="formmargin">
                
                 <div class="form-element">
                     
<!--                <label for="category">Category </label>  
                <select name="category" required>
                    <option  value="elec">Electronics</option>
                    <option  value="clothes">Clothes</option>
                    <option  value="health">Health & Personal Care</option>
                    <option  value="books">Books</option>

                </select>
            </div>
                  <div class="form-element">
                <label for="product">Product Name </label>  
                <input type="text" name="product" id="product" required>
            </div>-->
            <div class="form-element">
                <label for="desc">Product Description </label>  
                <input type="textbox" name="desc" id="desc" required>
            </div>

            <div class="form-element">
                <p> <label for="usage">Please specify </label>  <br>
            </div>
                <div class="form-element">
                 <input type="radio" name="usage" value="used" id="usage" required>Used
                 <input type="radio" name="usage" value="unused" id="usage">Unused</p>
               </div>
            <div class="form-element">
                <input type="submit" id="submitButton" value="Donate">
            </div>
        </form>
        </div>
    </body>
</html>
