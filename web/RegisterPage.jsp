<%-- 
    Document   : RegisterPage
    Created on : 2017-6-15, 16:07:57
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="judge" scope="request" class="mypackage.Judge"/>
<jsp:useBean id="saveintoDatabase" scope="request" class="mypackage.SaveintoDatabase"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>

        <form action="RegisterPage.jsp" methd="post">
            <%
                String username = request.getParameter("Username");
                String password = request.getParameter("Password");
                String password2 = request.getParameter("Password2");
                String realname = request.getParameter("Realname");
                String gender = request.getParameter("Gender");
                String birthday = request.getParameter("Year") + "." + request.getParameter("Month") + "." + request.getParameter("Day");

                int year, month, day;
            %>
            <h1>
                Register you own account!
            </h1>
            <p>
                Username:<input type='text' name ='Username'/><br>
                Password:<input type='password' name='Password'/><br>
                Confirm Password:<input type='password' name='Password2'/><br>

                Realname:<input type="text" name="Realname"/><br>

                Gender:
                <input type="radio" name="Gender" value="male">Male
                <input type="radio" name="Gender" value="female">Female<br>

                Birthday:
                <select name="Year">
                    <%
                        for (year = 2017; year >= 1920; year--) {
                    %>
                    <option value=<%= String.valueOf(year)%>> <%= String.valueOf(year)%></option>
                    <%
                        }
                    %>
                </select>

                <select name="Month">
                    <%
                        for (month = 1; month <= 12; month++) {
                    %>
                    <option value=<%= String.valueOf(month)%>> <%= String.valueOf(month)%></option>
                    <%
                        }
                    %>
                </select>

                <select name="Day">
                    <%
                        for (day = 1; day <= 31; day++) {
                    %>
                    <option value=<%= String.valueOf(day)%>> <%= String.valueOf(day)%></option>
                    <%
                        }
                    %>
                </select><br>

                <input type="submit" value="Finish">
            </p>
            <%
                if (username != null && password != null) {
                    if (judge.judgeUsername(username)) {
            %>
            <p>
                The username has already been registered!
            </p>
            <%
            } else {
                if (password.equals(password2)) {
                    saveintoDatabase.Save(username, password, realname, gender, birthday);
                } else {
            %>
            <p>
                The passwords you entered must be the same!
            </p>
            <%
                    }
                }
            } else {
            %>
            <p>
                Please enter your username and password!
            </p>
            <%
                }
            %>
        </form>
    </body>
</html>
