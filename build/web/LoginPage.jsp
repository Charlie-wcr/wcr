<%-- 
    Document   : LoginPage
    Created on : 2017-6-14, 19:55:04
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="judge" scope="request" class="mypackage.Judge"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sugary_y---Login Page</title>
    </head>
    <body style="text-align:center;" >
        <%
            String username = request.getParameter("Username");
            String password = request.getParameter("Password");
            
        %>
        <form action='LoginPage.jsp' method="post">
            <h1>
                Sugary_y
            </h1>

            <p>
                Username:<input type='text' name ='Username'/><br>
                Password:<input type='password' name='Password'/><br>
                <input type="submit" value='Login'/>
                <button type ="button" value="Register" onclick="window.location.href = 'RegisterPage.jsp'">Register</button>
            </p>

            <%
                if (username != null) {
                    if (judge.judgeUsername(username)) {
                        if (judge.judgePassword(password)) {
            %>

            <jsp:forward page="HomePage.jsp"/>

            <%
            } else {
            %>

            <h1>
                The password you entered isn't correct.
            </h1>

            <%
                }
            } else {
            %>

            <h1>
                The username doesn't exist.
            </h1>

            <%
                }
            } else {
            %>

            <p>
                Please enter your username and password.
            </p>

            <%
                }
            %>
        </form>
    </body>
</html>
