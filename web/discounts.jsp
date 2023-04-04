<%-- 
    Document   : discounts.jsp
    Created on : 15 Nov 2022, 3:53:39 PM
    Author     : PULE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="DiscountServlet">
            <h1>DISCOUNTS</h1>
            <input type="radio" name="discounts" value=12 />0%
            <input type="radio" name="discounts" value=14 />5%
            <input type="radio" name="discounts" value=10 />10%
            <input type="radio" name="discounts" value=8 />15%
            <input type="radio" name="discounts" value=9 />20% <br><br>
            <input type="submit" value="Apply Discount"/>
            <div class="open_grepper_editor" title="Edit & Save To Grepper"></div>
        </form>
    </body>
</html>
