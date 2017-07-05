<%-- 
    Document   : ProductsPage
    Created on : 2017-6-16, 15:09:53
    Author     : mac
--%>

<%@page import="mypackage.FindProductsDetails"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="findProductsDetails" scope="request" class="mypackage.FindProductsDetails"/>
<jsp:useBean id="cart" scope="request" class="mypackage.Cart"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Page</title>
    </head>

    <body>

        <%
            String number = request.getParameter("product_Number");
            String[] details = findProductsDetails.findDetails(number);
            String product_Number = details[0];
            String product_Name = details[1];
            String product_Image = details[2];
            String product_Price = details[3];
            String remaining_Quantity = details[4];
            String username = request.getParameter("username");
            String judge = request.getParameter("judge");
        %>

        <h1>
            <img src="<%=product_Image%>" alt="<%=product_Name%>" >
        </h1>

        <p>
            Product_Number: <%=product_Number%>
        </p>

        <p>
            Product_Name: <%=product_Name%>
        </p>

        <p>
            Product_Price: <%=product_Price%>$
        </p>

        <p>
            Remaining_Quantity: <%=remaining_Quantity%>
        </p>

        <form action="ProductsPage.jsp?username=<%=username%>&product_Number=<%=product_Number%>" method="post">
            Shopping_Quantity: <input type="number" value="1" name="quantity" min="1" max="100">
            <input type="submit" value="Add to cart" name="judge" >
            <input type ="button" value="View cart" onclick="window.location.href = 'Cart_Page.jsp?Username=<%=username%>&remaining_Quantity = <%=details[4]%>'">
        </form>

        <%
            if (judge != null) {
                String shopping_Quantity = request.getParameter("quantity");
                cart.add(username, product_Number, shopping_Quantity);
            }
        %>



    </body>

</html>
