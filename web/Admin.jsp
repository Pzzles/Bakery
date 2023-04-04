<%-- 
    Document   : Admin
    Created on : 08 Nov 2022, 10:27:55 AM
    Author     : TRAIN 11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <style>
  body {
  background-image: url("pexels-photo-2088170.webp");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
  font-family: Arial, Helvetica, sans-serif;
}
            .imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width:10%;

  border-radius: 50%;
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
input[type=text], input[type=password] {
  width: 30%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
        </style>
    </head>
    <body>
       
    <center><h1>Admin Login Page</h1></center>
    <form action="dash.jsp" method="post">
    <div class="imgcontainer">
    <img src="Rounded-31-1024.webp" alt="Avatar" class="avatar">
    </div>
        <center>
    <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>
    <br
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
    <br>   
    <button type="submit">Login</button>
    <br>
    </div>
        </center>
    </form>
    
    </body>
</html>
