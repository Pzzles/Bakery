<%-- 
    Document   : bread
    Created on : 02 Nov 2022, 11:10:38 AM
    Author     : TRAIN 11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>JSP Page</title>
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
div.cakes {
  margin: 5px;
  border: 1px solid #ccc;
  float: left;
  width: 180px;
}

div.cakes:hover {
  border: 1px solid #777;
}

div.cakes img {
  width: 100%;
  height: auto;
}

div.desc {
  padding: 15px;
  text-align: center;
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
     
      
    </div>
  </div> 
  <a href="login.jsp"><i class="fa fa-fw fa-user"></i> Login</a>
  <a href="#"><i class="fa fa-fw fa-search"></i> Search</a>
  <a href="aboutUs.jsp">About Us</a> 
  <a href="#"><i class="fa fa-fw fa-envelope"></i> Contact</a>
   <a href="login.jsp"><i class="fa fa-shopping-cart"></i> Cart</a>
</div>
        <h1>Hello I am bread page</h1>
        
  <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="bread/OIP.jpg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
  </div>

<div class="cakes">
  <a target="_blank" href="cake2.jpeg">
      <img src="bread/pexels-photo-11654224.jpeg" alt="Forest" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>

<div class="cakes">
  <a target="_blank" href="choc_Cake.webp">
      <img src="bread/pexels-photo-12737800.jpeg" alt="Northern Lights" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>

<div class="cakes">
  <a target="_blank" href="CarrotCake.webp">
      <img src="bread/pexels-photo-137103.webp" alt="Mountains" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>

  <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="bread/pexels-photo-2955819.webp" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>
     
 <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="bread/pexels-photo-5588987.jpeg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
  </div>
 

 <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="bread/pexels-photo-137103.webp" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
  </div>
        
 <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="bread/pexels-photo-4049955.jpeg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
  </div>
        
 <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="bread/pexels-photo-960662.jpeg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
  </div>
        
       
  <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="bread/pexels-photo-5966346.jpeg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
  </div>
 
 <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="bread/pexels-photo-8599722.jpeg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
  </div>
        
 <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="bread/pexels-photo-8599596.jpeg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
  </div>
        
        
    </body>
</html>
