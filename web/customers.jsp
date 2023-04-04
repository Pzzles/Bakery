<%-- 
    Document   : customers
    Created on : 08 Nov 2022, 2:04:00 PM
    Author     : TRAIN 11
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dea5a4;
            }
            body {
                background-image: url("pexels-photo-2088170.webp");
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: cover;
            }
        </style>
    </head>
    <body>



        <h2>Customers</h2>

        <table>

            <tr>
                <th>Customer Title</th>
                <th>Customer Name</th>
                <th>Customer Surname</th>
                <th>Customer ID Number</th>
                <th>Customer Contact</th>
                <th>Customer Home Address</th>
                <th>Customer Email</th>

            </tr>

            <c:forEach var="customer" items="${Customers}">
                <tr>
                    <td>${customer.title}</td>
                    <td>${customer.name}</td>
                    <td>${customer.surname}</td>
                    <td>${customer.ID_Number}</td>
                    <td>${customer.Contact}</td>
                    <td>${customer.Home_Address}</td>
                    <td>${customer.Email}</td>
                </tr>

            </c:forEach>

        </table>

    </body>
</html>


