package mypackage;

import java.sql.*;
import java.util.logging.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mac
 */
public class Judge {

    Boolean judge = false;

    public boolean judgeUsername(String username) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping website", "root", "3023");
            Statement statement = connection.createStatement();
            ResultSet usernameResultSet = statement.executeQuery("select Username from user_information");
            while (usernameResultSet.next()) {
                if (username.equals(usernameResultSet.getString("Username"))) {
                    judge = true;
                    break;
                } else {
                    judge = false;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Judge.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Judge.class.getName()).log(Level.SEVERE, null, ex);
        }
        return judge;
    }

    public boolean judgePassword(String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping website?user=root&password=3023");
            Statement statement = connection.createStatement();
            ResultSet passwordResultSet = statement.executeQuery("select Password from user_information");
            while (passwordResultSet.next()) {
                if (password.equals(passwordResultSet.getString("Password"))) {
                    judge = true;
                    break;
                } else {
                    judge = false;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Judge.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Judge.class.getName()).log(Level.SEVERE, null, ex);
        }
        return judge;
    }
}
