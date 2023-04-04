<%-- 
    Document   : cakes
    Created on : 02 Nov 2022, 11:10:24 AM
    Author     : TRAIN 11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
    
body {
  font-family: Arial, Helvetica, sans-serif;
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
body{
    background-image: url("pexels-photo-2088170.webp");
}
    
.navbar {
  overflow: hidden;
  background-color: #dea5a4;

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

.container {
  position: relative;
  width: 190px;
  height: 150px;
}

.image {
  display: block;
  
}

.overlay {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  height: 100%;
  width: 100%;
  opacity: 0;
  transition: .5s ease;
  background-color: #008CBA;
}

.container:hover .overlay {
  opacity: 1;
}

.text {
  color: white;
  font-size: 20px;
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
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

    
<div class="container">
      <img src="NEW-AVENGERS-768x768.jpg" alt="Avatar" class="image" height="170" width="190">
  <div class="overlay">
    <div class="text">
        <p>Avengers Cake</p>
        <button type="submit">Add to cart</button>
        <p>Price: R200.00</p></div>
  </div>
</div>

<div class="cakes">
    <a target="_blank" href="cakes/">
      <img src="cakes/New_-CaramelNYBakedCheesecake-768x768.jpg" alt="Forest" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>

<div class="cakes">
  <a target="_blank" href="choc_Cake.webp">
      <img src="cakes/NEW-COCOMELON-768x768.jpg" alt="Northern Lights" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>

<div class="cakes">
  <a target="_blank" href="CarrotCake.webp">
      <img src="cakes/NEW-DINO-768x768.jpg" alt="Mountains" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>

  <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="cakes/NEW-DUSTYROSE-1-768x768.jpg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>
    
  <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="cakes/NEW-HATSOFFBLUE-768x768.jpg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>
    
  <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="cakes/NEW-HATSOFFPINK-768x768.jpg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>
    
  <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="cakes/NEW-ICECREAM-768x768.jpg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>
    
  <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="cakes/NEW-JUNGLE-768x768.jpg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>
    
  <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="cakes/NEW-JUSTICELEAGUE-768x768.jpg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>
    
  <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="cakes/NEW-Pokemon-768x768.png" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>
    
  <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="cakes/New_Red_Cheese-2-768x768.jpg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>
    
    <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="cakes/New_Rocky_Road_Cake-768x768.jpg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>
    
    <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="cakes/New_Carrot-Cake2-768x768.jpg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>
    
    <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="cakes/New_Lemon-Meringue-Vanilla-Cake-768x768.jpg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>
    
    <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="cakes/New_Oreo-Cake-1-768x768.jpg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>
    
    <div class="cakes">
  <a target="_blank" href="cake1.jpeg">
      <img src="cakes/New_Chai_Cake-768x768.jpg" alt="Cinque Terre" width="600" height="400">
  </a>
  <div class="desc">Price R0.0</div>
</div>

</body>
</html>
