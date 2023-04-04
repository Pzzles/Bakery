<%-- 
    Document   : login
    Created on : 02 Nov 2022, 11:13:04 AM
    Author     : TRAIN 11
--%>
<%@page import="java.util.List"%>
<%@page import="co.za.mecer.cart.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
            ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cart_list");
           // List<Cart> cartProduct = null;
            if (cartList != null) {
                request.setAttribute("cartList", cartList);
            }
%>

<!--<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <%@include file="includes/header.jsp"  %>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <form method="post" action="LoginServlet"
          onsubmit = "return validate">
        <div class="imgcontainer">

        </div>
        <center>
            <div class="container">
                <label for="uname"><b>Username</b></label>
                <input type="text" placeholder="Enter Username" name="username" required>
                <br>
                <label for="psw"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="password" required>
                <br>   
                <button type="submit">Login</button>
                <br>

                <a href = "register.jsp">
                    Register
                </a>

                <br>
                <label>
                    <input type="checkbox" checked="checked" name="remember"> Remember me
                </label>
            </div>
        </center>

        <div class="container" style="background-color:#f1f1f1">
            <button type="button" class="cancelbtn">Cancel</button>
            <span class="psw">Forgot <a href="#">password?</a></span>
        </div>
    </form>
    <%@include file="includes/footer.jsp"  %>
</body>
</html>-->







<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
<%@include file="includes/header.jsp"  %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
    body {font-family: Arial, Helvetica, sans-serif;}
    form {border: 3px solid #f1f1f1;
    }

    input[type=text], input[type=password] {
        width: 30%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }

    button {
        background-color: #dea5a4;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        margin-left: 80px; 
        border: none;
        cursor: pointer;
        width: 30%;
    }

    button:hover {
        opacity: 0.8;
    }

    .cancelbtn {
        width: auto;
        padding: 10px 18px;
        background-color: #f44336;
    }

    .imgcontainer {
        text-align: center;
        margin: 24px 0 12px 0;
    }

    img.avatar {
        width:10%;

        border-radius: 50%;
    }

    .container {
        padding: 16px;
    }

    span.psw {
        float: right;
        padding-top: 16px;
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
    .navbar {
        overflow: hidden;
        background-color: #dea5a4;

    }

    /* Change styles for span and cancel button on extra small screens */
    @media screen and (max-width: 300px) {
        span.psw {
            display: block;
            float: none;
        }
        .cancelbtn {
            width: 100%;
        }
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

    <a href="aboutUs.jsp">About Us</a> 
    <a href="#"><i class="fa fa-fw fa-envelope"></i> Contact</a>
    <a href="login.jsp"><i class="fa fa-shopping-cart"></i> Cart</a>
    <a href="Admin.jsp"><i class="fa fa-user icon"></i>Admin</a>


</div>
<br>
<br>
<center>
<h2>Login</h2>
</center>
<form method="post" action="LoginServlet" 
onsubmit = "return validate">
<div class="imgcontainer">
    <img src="Rounded-31-1024.webp" alt="Avatar" class="avatar">
</div>
<center>
    <div class="container">
        <label for="uname"><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="username" required>
        <br>
        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" required>
        <br>   
        <button type="submit">Login</button>
        <br>

        <a href = "register.jsp">
            Register
        </a>

        <br>
        <label>
            <input type="checkbox" checked="checked" name="remember"> Remember me
        </label>
    </div>
</center>

<div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
</div>
</form>
<%@include file="includes/footer.jsp"  %>
</body>
</html>
