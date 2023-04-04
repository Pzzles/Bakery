<%-- 
    Document   : register
    Created on : 02 Nov 2022, 11:13:15 AM
    Author     : TRAIN 11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Add icon library -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            body {font-family: Arial, Helvetica, sans-serif;}
            * {box-sizing: border-box;}

            .input-container {
                display: -ms-flexbox; /* IE10 */
                display: flex;
                width: 100%;
                margin-bottom: 15px;
            }

            .icon {
                padding: 10px;
                background: #dea5a4;
                color: white;
                min-width: 50px;
                text-align: center;
            }

            .input-field {
                width: 100%;
                padding: 10px;
                outline: none;
            }

            .input-field:focus {
                border: 2px solid dodgerblue;
            }

            /* Set a style for the submit button */
            .btn {
                background-color: #dea5a4;
                color: white;
                padding: 15px 20px;
                border: none;
                cursor: pointer;
                width: 100%;
                opacity: 0.9;
            }

            .btn:hover {
                opacity: 1;
            }
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
                    <a href="register.jsp">Pastry</a>
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

        <form method="post" action="regServlet" style="max-width:500px;margin:auto">
            <h2>Register Form</h2>
            <div class="input-container">
                <i class="fa fa-user icon"></i>
                <input class="input-field" type="text" placeholder="Title" name="title" required>
            </div>

            <div class="input-container">
                <i class="fa fa-user icon"></i>
                <input class="input-field" type="text" placeholder="Name" name="firstname" required>
            </div>

            <div class="input-container">
                <i class="fa fa-user icon"></i>
                <input class="input-field" type="text" placeholder="Surname" name="surname" required>
            </div>
            <div class="input-container">
                <i class="fa fa-user icon"></i>
                <input class="input-field" type="text" placeholder="ID Number" name="id_Number" required>
            </div>
            <div class="input-container">
                <i class="fa fa-home icon"></i>
                <input class="input-field" type="text" placeholder="Address" name="deliveryAddress">
            </div>
            <div class="input-container">
                <i class="fa fa-envelope icon"></i>
                <input class="input-field" type="email" placeholder="Email" name="email" required>
            </div>
            <div class="input-container">
                <i class="fa fa-phone icon"></i>
                <input class="input-field" type="text" placeholder="Phone Number" name="phone" required>
            </div>
            <div class="input-container">
                <i class="fa fa-key icon"></i>
                <input class="input-field" type="password" placeholder="Password" name="password" required>
            </div>

            <button type="submit" class="btn" name="register_btn" value="Register">Register</button>
            <br>

            <h3>Do you have an account already? <a href = "login.jsp">Login</a></h3>

        </form>

    </body>
</html>

