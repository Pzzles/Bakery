<%@page import="org.glassfish.jersey.internal.inject.Custom"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bakery</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
            * {box-sizing: border-box}
            body {font-family: Verdana, sans-serif; margin:0}
            .mySlides {display: none}
            img {vertical-align: middle;}

            /* Slideshow container */
            .slideshow-container {
                max-width: 1000px;
                position: relative;
                margin: auto;
            }

            /* Next & previous buttons */
            .prev, .next {
                cursor: pointer;
                position: absolute;
                top: 50%;
                width: auto;
                padding: 16px;
                margin-top: -22px;
                color: white;
                font-weight: bold;
                font-size: 18px;
                transition: 0.6s ease;
                border-radius: 0 3px 3px 0;
                user-select: none;
            }

            /* Position the "next button" to the right */
            .next {
                right: 0;
                border-radius: 3px 0 0 3px;
            }

            /* On hover, add a black background color with a little bit see-through */
            .prev:hover, .next:hover {
                background-color: rgba(0,0,0,0.8);
            }

            /* Caption text */
            .text {
                color: #f2f2f2;
                font-size: 15px;
                padding: 8px 12px;
                position: absolute;
                bottom: 8px;
                width: 100%;
                text-align: center;
            }

            /* Number text (1/3 etc) */
            .numbertext {
                color: #f2f2f2;
                font-size: 12px;
                padding: 8px 12px;
                position: absolute;
                top: 0;
            }

            /* The dots/bullets/indicators */
            .dot {
                cursor: pointer;
                height: 15px;
                width: 15px;
                margin: 0 2px;
                background-color: #bbb;
                border-radius: 50%;
                display: inline-block;
                transition: background-color 0.6s ease;
            }

            .active, .dot:hover {
                background-color: #717171;
            }

            /* Fading animation */
            .fade {
                animation-name: fade;
                animation-duration: 1.5s;
            }

            @keyframes fade {
                from {opacity: .4} 
                to {opacity: 1}
            }
            .navbar .search-container {
                float: right;
            }

            .navbar input[type=text] {
                padding: 6px;
                margin-top: 8px;
                font-size: 12px;
                border: none;
            }

            .navbar .search-container button {
                float: right;
                padding: 6px 10px;
                margin-top: 8px;
                margin-right: 16px;
                background: #ddd;
                font-size: 12px;
                border: none;
                cursor: pointer;
            }

            .navbar .search-container button:hover {
                background: #ccc;
            }

            @media screen and (max-width: 600px) {
                .navbar .search-container {
                    float: none;
                }
                .navbar a, .navbar input[type=text], .navbar .search-container button {
                    float: none;
                    display: block;
                    text-align: left;
                    width: 100%;
                    margin: 0;
                    padding: 14px;
                }
                .navbar input[type=text] {
                    border: 1px solid #ccc;  
                }
            }

            /* On smaller screens, decrease text size */
            @media only screen and (max-width: 300px) {
                .prev, .next,.text {font-size: 11px}
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
                <a href="cart.jsp"><i class="fa fa-shopping-cart"></i>Cart<span class="badge bade-danger">${cartList.size() }</span></a>
                <a href="orders.jsp"><i class="fa fa-orders"></i>Orders</a>
                <a href="LogoutServlet"><i class="fa fa-fw fa-user "></i> Logout</a>


                <div class="search-container">
                    <!--    <form action="/action_page.php">
                          <input type="text" placeholder="Search.." name="search">
                          <button type="submit"><i class="fa fa-fw fa-search""></i></button>
                        </form>-->
                </div>
            </div>
           
            <br>
            <div class="slideshow-container">

                <div class="mySlides fade">

                    <a href="cakes.jsp"><img src="cakeIndex.webp" style="width:100%"></a>
                    <a href="cakes.jsp" ><div class="text">Cakes</div></a>
                </div>

                <div class="mySlides fade">

                    <img src="breadIndex.jpeg" style="width:100%">
                    <a href="bread.jsp"><div class="text">Bread</div></a>
                </div>

                <div class="mySlides fade">

                    <a href="cookies.jsp"> <img src="cupIndex.jpeg" style="width:100%" alt="cupIndex image"></a>
                    <div class="text">Cup Cakes</div>
                </div>



                <a class="prev" onclick="plusSlides(-1)">❮</a>
                <a class="next" onclick="plusSlides(1)">❯</a>

            </div>
            <br>

            <div style="text-align:center">
                <span class="dot" onclick="currentSlide(1)"></span> 
                <span class="dot" onclick="currentSlide(2)"></span> 
                <span class="dot" onclick="currentSlide(3)"></span> 
            </div>
            <script>
                let slideIndex = 1;
                showSlides(slideIndex);

                function plusSlides(n) {
                    showSlides(slideIndex += n);
                }

                function currentSlide(n) {
                    showSlides(slideIndex = n);
                }

                function showSlides(n) {
                    let i;
                    let slides = document.getElementsByClassName("mySlides");
                    let dots = document.getElementsByClassName("dot");
                    if (n > slides.length) {
                        slideIndex = 1
                    }
                    if (n < 1) {
                        slideIndex = slides.length
                    }
                    for (i = 0; i < slides.length; i++) {
                        slides[i].style.display = "none";
                    }
                    for (i = 0; i < dots.length; i++) {
                        dots[i].className = dots[i].className.replace(" active", "");
                    }
                    slides[slideIndex - 1].style.display = "block";
                    dots[slideIndex - 1].className += " active";
                }
            </script>
        </body>
    </html>
