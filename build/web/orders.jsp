<%-- 
    Document   : orders
    Created on : 15 Nov 2022, 7:55:10 PM
    Author     : PULE
--%>
<%@page import="java.util.List"%>
<%@page import="co.za.mecer.cart.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cart_list");
   // List<Cart> cartProduct = null;
    if (cartList != null) {
        request.setAttribute("cartList", cartList);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Orders Page</title>
        <%@include file="includes/header.jsp"  %>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%@include file="includes/footer.jsp"  %>
    </body>
</html>
