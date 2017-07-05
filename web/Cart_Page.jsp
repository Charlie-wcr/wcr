<%-- 
    Document   : Cart_Page
    Created on : 2017-6-18, 16:22:26
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="cart" scope="request" class="mypackage.Cart"/>
<jsp:useBean id="findProductsDetails" scope="request" class="mypackage.FindProductsDetails"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart_Page</title>
    </head>
    <style>
        table {
            border-collapse: collapse;
        }

        table, td, th {
            border: 1px solid blue;
        }
    </style>
    <body>        

        <%
            String username = request.getParameter("Username");
            String buy = request.getParameter("buy_button");
            String alter = request.getParameter("alter_button");
            String quantity[] = request.getParameterValues("quantity1");
            String[][] yourCart = new String[6][5];
        %>

        <form action="Cart_Page.jsp?Username=<%=username%>" method="post">
            <table border="1">
                <tr>
                    <td>Product_Number</td>
                    <td>Product_Image</td>
                    <td>Product_Name</td>
                    <td>Product_Price</td>
                    <td>Product_Quantity</td>
                </tr>
                <%
                    yourCart = cart.view(username);
                    String buy_button = request.getParameter("buy_button");
                    String remaining_Quantity = request.getParameter("remaining_Quantity");

                    for (int i = 0; i <= 5; i++) {

                        if (yourCart[i][1] != null && yourCart[i][1] != "0") {
                            if (quantity != null && quantity[i] != yourCart[i][1]) {
                                yourCart[i][1] = quantity[i];
                                cart.alter(username, yourCart[i][0], quantity[i]);
                            }
                %> 
                <tr>
                    <td><input type="checkbox" name="<%=yourCart[i][0]%>" value="<%=yourCart[i][0]%>"><%=yourCart[i][0]%><br></td>
                    <%
                        if(buy_button != null){
                            cart.buy(username, yourCart[i][0], quantity[i]);
                        }
                        %>
                    <td><img src="<%=yourCart[i][3]%>" alt="<%=yourCart[i][0]%>"/></td>
                    <td><%=yourCart[i][2]%></td>
                    <td><%=yourCart[i][4]%></td>
                    <td><input type="number" value="<%=yourCart[i][1]%>" name="quantity1" min="0" max="100"></td>
                </tr>
                <%
                        }
                    }
                %>
            </table>

            <p>
                <input type="submit" value="Alter!" name="alter_button" >
                <input type="submit" value="Buy!" name="buy_button" >
                <button type="button" value="Back to ProductsPage" onclick="window.location.href = 'HomePage.jsp?Username=<%=username%>'">Back to ProductsPage</button>
            </p>

        </form>

    </body>
</html>
