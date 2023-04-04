<%-- 
    Document   : aboutUs
    Created on : 02 Nov 2022, 1:10:12 PM
    Author     : TRAIN 11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>About us</title>
        <style>
html {
    scroll-behavior: smooth;
}
body {
  font-family: Arial, Helvetica, sans-serif;
}

.navbar {
  overflow: hidden;
  background-color: #dea5a4;

}
body {
  background-image: url("pexels-photo-2088170.webp");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;

}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}

</style>
    </head>
    <body>
         <div class="navbar">
             <a href="index.jsp">Home</a>
  
  <div class="dropdown">
    <button class="dropbtn">Products
      <i class="fa fa-caret-down"></i>
    </button>

    <div class="dropdown-content">
        <a href="cakes.jsp">Cakes</a>
        <a href="pastry.jsp">Pastry</a>
        <a href="cookies.jsp">Cookies</a>
        <a href="bread.jsp">Bread</a>
      
    </div>
  </div> 
  <a href="login.jsp"><i class="fa fa-fw fa-user"></i> Login</a>
  <a href="#"><i class="fa fa-fw fa-search"></i> Search</a>
  <a href="aboutUs.jsp">About Us</a> 
  <a href="#"><i class="fa fa-fw fa-envelope"></i> Contact</a>
   <a href="login.jsp"><i class="fa fa-shopping-cart"></i> Cart</a>
</div>
        <h1>GET IN TOUCH</h1>
        <p>We’d love to hear from you, or you can pop in to taste the magic!</p>
        <p>Call us:021 551 6107</p>
        <p>Mail us:rder@topiefor.co.za</p>
        <p>Visit us:Pretoria</p>
        <p>Trading Hours:
           Monday to Friday | 8h00 – 17h00
           Saturday | 8h00 – 14h00
           Sundays | Closed
        </p>
    </body>
</html>
