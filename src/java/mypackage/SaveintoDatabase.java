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
public class SaveintoDatabase {

    public void Save(String username, String password, String realname, String gender, String birthday) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping website", "root", "3023");
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into userinformation values('" + username + "','" + password + "','" + realname + "','" + gender + "','" + birthday + "','" + 0 + "')");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Judge.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Judge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
