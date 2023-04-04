<%-- 
    Document   : viewAll
    Created on : 10 Nov 2022, 1:49:46 PM
    Author     : PULE
--%>


<%@page import="co.za.mecer.client.Customer"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
         List<Customer> custList = (List)request.getAttribute("styles");
        for(Customer customer : custList ){
            System.out.println(customer.getTitle());
        }
          %>
    </body>
</html>
