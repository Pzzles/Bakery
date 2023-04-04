<%-- 
    Document   : addItem
    Created on : 08 Nov 2022, 11:31:00 AM
    Author     : TRAIN 11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- 
    Document   : addProducts
    Created on : Nov 3, 2022, 1:41:19 PM
    Author     : TRAIN 20
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Products</title>
    </head>
    <style>
        *{
            box-sizing: border-box;
            margin: 0;
            padding: 0;
            text-decoration: none;
            list-style: none;
        }
        body{

            background-color:white;
            font-family: montserrat;
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
        }

        nav{
            background: #00CED1;
            height: 80px;
            width: 100%;

        }

        label.logo{
            color: white;
            font-size: 35px;
            line-height: 80px;
            padding: 0 100px;
            font-weight: bold;
        }
        nav ul{
            float: right;
            margin-right: 20px;
        }

        nav ul li{
            display: inline-block;
            line-height: 80px;
            margin: 0 5px;

        }

        nav ul li a{
            color: whitesmoke;
            font-size: 17px;
            text-transform: uppercase;

        }
        nav ul img{
            height: 30px;


        }
        .reg-Container{

            background-color: rgba(255, 255, 255, 0.8);
            -webkit-box-shadow: 0px 1px 20px -3px rgba(0,0,0,0.75);
            -moz-box-shadow: 0px 1px 20px -3px rgba(0,0,0,0.75);
            box-shadow: 0px 1px 20px -3px rgba(0,0,0,0.75);

            padding: 1rem;
            grid-template-columns: 300px 1fr;
            gap: 1rem;
            align-items: center;
            max-width: 700px;

            margin: 0 auto;
            font: 500 100%/1.5 system-ui;
            margin-top: 50px;

        }







        footer{
            margin-top: 20px;
            background: #505761;
            height: 100px;
            width: 100%;

        }


        footer p{
            color: white;
            font-size: 15px;
            line-height: 40px;
            margin-left: 20px;
            font-weight: bold;
        }



        /* Full-width input fields */
        input[type=text], input[type=password] {
            width: 100%;
            padding: 15px;
            border: none;
            background: #f1f1f1;
        }



        input[type=text]:focus, input[type=password]:focus {
            background-color: #ddd;
            outline: none;
        }

        hr {
            margin-top: 10px;
            border: 2px solid #f1f2f2;
            margin-bottom: 25px;
        }


        .addproduct {
            background-color: #dea5a4;
            color: white;
            padding: 10px 3px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 20%;

        }

        .addproduct:hover {
            opacity: 1;
        }


        a {
            color: dodgerblue;
        }


        .signin {

            text-align: center;
        }

        .lterName h1{
            margin-top: 20px;
            font-size: 25px;
            text-align: center;
            display: flex;
            align-items: center;
            justify-content: center;


        }
        .navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;

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
#selOptions{
    width:100px;
    height: 25px;
}
    </style>
</head>
<body>
    
    
    <div class="navbar">
        <a href="dash.jsp">Home</a>
 
  <a href="login.jsp"><i class="fa fa-fw fa-user"></i> LogOut</a>
  
</div>
    <div class="lterName">
        <h1>Admin</h1>
    </div>
    
    <div class="reg-Container">



        <form method="" action="dash.jsp">

            <br>


            <h1>Add Product</h1>

            <hr>

            <h for="product_name"><b>Item Name</b></h>
            <input type="text" placeholder="Enter the product name" name="item_name">

            <h for="product_desc"><b>Item Description</b></h>
            <input type="text" placeholder="Item Description" name="item_desc">
            <h for="price"><b>Price</b></h>
            <input type="text" placeholder="Item Price" name="item_rice">
            <h for="price"><b>Nutrient Info</b></h>
            <input type="text" placeholder="nutrient info" name="item_rice">
            <h for="price"><b>Ingredients</b></h>
            <input type="text" placeholder="Ingredients" name="ingredients">
            <br>
            <h for="price"><b>Category</b></h>
            <select name="cat" id="selOptions">
                <option value="cakes">Cakes</option>
                <option value="bread"> Bread</option>
                <option value="cookies">Cookies</option>
                <option value="pastry">Pastry</option>
            </select>
           
            <br>
            <h for="product_pic"><b>Item Image</b></h>
            <input type="file" id="file"/>
            <hr>
            <br>
            <button type="submit" class="addproduct">Add Item</button>

        </form>




    </div>

</body>
</html>
