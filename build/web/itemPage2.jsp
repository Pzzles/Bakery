<%-- 
    Document   : ItemPage
    Created on : 03 Nov 2022, 9:19:53 AM
    Author     : TRAIN 11
--%>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
<style>
.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width: 300px;
  margin: auto;
  text-align: center;
  font-family: arial;
}

.price {
  color: grey;
  font-size: 22px;
}

.card button {
  border: none;
  outline: 0;
  padding: 12px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}

.card button:hover {
  opacity: 0.7;
}
.navbar {
  overflow: hidden;
  background-color: #dea5a4;

}
body {
  background-image: url("b.avif");
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
        <a href="register.jsp">Pastry</a>
        <a href="cookies.jsp">Cookies</a>
      <a href="bread.jsp">Bread</a>
      
    </div>
  </div> 
  <a href="login.jsp"><i class="fa fa-fw fa-user"></i> Login</a>
  <a href="#"><i class="fa fa-fw fa-search"></i> Search</a>
  <a href="aboutUs.jsp">About Us</a> 
  <a href="#"><i class="fa fa-fw fa-envelope"></i> Contact</a>
   <div class="cart">
       <a href="cart.jsp"><i class="fa fa-shopping-cart">Cart</i></a>
    </div>
</div>
   

<h2 style="text-align:center">Product</h2>

<div class="card">
    <img src="cakes/New_Red_Cheese-2-768x768.jpg" alt="Denim Jeans" style="width:100%">
  <h1>RED CHEESE CAKE</h1>
  <p class="price">R0.0</p>
  <p>.....Desc</p>
  <p><button>Add to Cart</button></p>
</div>

</body>
</html>

