<%-- 
    Document   : HomePage
    Created on : 2017-6-16, 14:50:02
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home_Page</title>
    </head>
    <body>
        <%
            String username = request.getParameter("Username");            
        %>
        <h1>
            Hello <%= username%>,<br> 
            Welcome to Sugery_y!
        </h1> 
        <p>
            <a href="ProductsPage.jsp?product_Number=00001&username=<%= username%>" >
            <img src="Product1.webp.jpg" alt="Product1">
            </a>

            <a href="ProductsPage.jsp?product_Number=00002&username=<%= username%>">
            <img src="Product2.webp.jpg" alt="Product2">
            </a>
        </p>
       
        <p>
            <a href="ProductsPage.jsp?product_Number=00003&username=<%= username%>">
            <img src="Product3.webp.jpg" alt="Product3">
            </a>
        </p>
        
        <p>
            <a href="ProductsPage.jsp?product_Number=00004&username=<%= username%>">
            <img src="Product4.webp.jpg" alt="Product4">
            </a>
        </p>
        
        <p>
            <a href="ProductsPage.jsp?product_Number=00005&username=<%= username%>">
            <img src="Product5.webp.jpg" alt="Product5">
            </a>
        </p>
        
        <p>
            <a href="ProductsPage.jsp?product_Number=00006&username=<%= username%>">
            <img src="Product6.webp.jpg" alt="Product6">
            </a>
        </p>
    </body>
</html>
