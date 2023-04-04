<%-- 
    Document   : newjsp
    Created on : 15 Nov 2022, 7:28:44 PM
    Author     : PULE
--%>
<%@page import="co.za.mecer.order.OrderLineItem"%>
<%@page import="java.util.HashMap"%>
<%@page import="co.za.mecer.item.Item"%>
<%@page import="java.util.List"%>
<%@page import="co.za.mecer.cart.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
//<%
//HashMap<Integer,Item> cartList = (HashMap<Integer,Item>) session.getAttribute("cart");
//%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cart Page</title>
        <%@include file="includes/header.jsp"  %>
    </head>
    <body>
        <form method="post" action="AddToCartServlet">
        <div class="container">
            <div class="d-flex py-3">
<!--                <h3>Total Price:R 567</h3>-->
                <a class="mx-3 btn btn-primary" href="#">Check Out</a>
            </div>
            <table class="table table-loght">
                <thead>
                    <tr>
                        <th scope="col">Name</th>
                        <th scope="col">Price</th>
                        <th scope="col">Description</th>
                        <th scope="col">Allergens</th>
                        <th scope="col">Quantity</th>
                        <th scope="col"></th>
                        <th scope="col">Cancel</th>
                    </tr>
                </thead>
                <tbody>
                <H4>TOtal number of items: <%= session.getAttribute("quantityCount")%></h4>
                    <%
                        List<OrderLineItem> order = (List<OrderLineItem> ) request.getAttribute("orderitems");
                     //   List<OrderLineItem> order = (List<OrderLineItem> ) session.getAttribute("orderitems");
                        if (order != null) {
                            for (OrderLineItem oli : order) {
                                
                    %>
                <tr>
                    <td> <%=oli.getItem().getItem_Name()%> </td>
                    <td>R<%=oli.getItem().getPrice()%></td>
                    <td><%=oli.getItem().getDesription()%> </td>
                    <td><%=oli.getItem().getAllegens()%></td>
                    <td><%=oli.getQuantity()%></td>

                    
                    
                    <td>
                        <form action="" method="post" class="form-inline">
                            <input type="hidden" name="id" value="<%=oli.getItem().getItem_Id()%>" class="form-input">
                            <div class="form-group d-flex justify-content-between">

                                <a class="btn btn-sm btn-decre" href="">
                                    <i class="fas fa-minus-square"></i>
                                </a>

                                <input type="text" name="quantity" class="form-control" value="1" readonly>
                                <a class="btn btn-sm btn-incre" href=""><i
                                        class="fas fa-plus-square"></i></a>
                            </div>
                        </form>
                    </td>
                    <td><a class="btn btn-sm btn-danger" href="RemoveFromCartServlet">Remove</a></td>
                </tr>
                <%
                        }
                    }
                %>
<h1>Total Price: R<%= session.getAttribute("TotalPrice") %></h1>
                </tbody>
            </table>

        </div>
        <%@include file="includes/footer.jsp"  %>
    </body>
</html>
