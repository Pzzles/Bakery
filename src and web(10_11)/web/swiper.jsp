<%-- 
    Document   : swiper
    Created on : 03 Nov 2022, 2:57:42 PM
    Author     : TRAIN 11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>Swiper Article</title>
   <link rel="stylesheet" href="style.css">
   <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css"/>


</head>
<body>
   <div class="container">
       <!-- Project content container -->
       <div class="project_content">
           <h1>Swiper JS</h1>
           <h2>Building modern sliders with HTML, CSS and Swiper JS</h2>
           <h2>Author: Aboze Brain</h2>
           <p>Bio: Aboze Brain John is a data scientist. He has experience in data science and analytics, software engineering, product research and technical writing</p>
           <p>The code can be found on GitHub <a href="#">here</a> and the article can be found on Logrocket blog <a href="#">here</a></p>
           <p></p>
           <img src="/logrocket.png" alt="logrocket logo">
       </div>
       <!-- Slider main container -->
       <div class="swiper mySwiper">
           <div class="swiper-wrapper">
             <div class="swiper-slide slide_1">Slide 1</div>
             <div class="swiper-slide slide_2">Slide 2</div>
             <div class="swiper-slide slide_3">Slide 3</div>
             <div class="swiper-slide slide_4">Slide 4</div>
             <div class="swiper-slide slide_5">Slide 5</div>
           </div>
         </div>
   </div>


   <script src="https://unpkg.com/swiper@8/swiper-bundle.min.js"></script>
   <script src="/script.js"></script>
</body>
</html>