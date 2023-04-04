<%-- 
    Document   : addCategory
    Created on : 10 Nov 2022, 9:14:45 AM
    Author     : TRAIN 11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Category</title>
        <style>
             body {
            background-image: url("pexels-photo-2088170.webp");
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
}
                        .text-input{
                margin-right: 100px;
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
        </style>
    </head>
    <body>
        <div class="navbar">
            <a href="login.jsp">Log Out</a>
            <a href="dash.jsp">Home</a>
  
        </div>
        <h1>ADD Category</h1>
        <form method="post" action="CategoryServlet">
        <label>Enter the Category</label>
        <input type="text" name="edtAddCat">
        
        <button type="submit" name = "addCategory">Submit</button>
        </form>
    </body>
</html>
