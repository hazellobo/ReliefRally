
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
     <div class="topnav">
  <a class="active" href="#home">Home</a>
 
  <a href="viewRecords">Customer Records</a>
  <a href="viewDonaters">Donation Records</a>
   <a href="viewPurchase">Purchase Records</a>
   <a href="recordSearch.jsp">Search Customer</a>
  <a id="floater" href="LogoutServlet">Logout</a>
</div>
    </body>
    <style>.topnav {
    background-color: #333;
    overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
    float: left;
    color: #f2f2f2;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
    background-color: #ddd;
    color: black;
}

/* Add a color to the active/current link */
.topnav a.active {
    background-color: #4CAF50;
    color: white;
    
}
#floater{
    float:right;
}
    
    </style>
    
</html>

