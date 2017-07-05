package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mac
 */
public class Cart {

    public void add(String username, String product_Number, String shopping_Quantity) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping website", "root", "3023");
            Statement statement1 = connection.createStatement();
            Statement statement2 = connection.createStatement();
            Statement statement3 = connection.createStatement();
            ResultSet rs = statement1.executeQuery("select * from cart where Username = '" + username + "' and Product_Number = '" + product_Number + "'");
            if (rs.next()) {
                statement2.executeUpdate("update cart set Shopping_Quantity = Shopping_Quantity + '" + shopping_Quantity + "' where Username = '" + username + "' and Product_Number = '" + product_Number + "'");
            } else {
                statement3.executeUpdate("insert into cart values('" + username + "','" + product_Number + "','" + shopping_Quantity + "')");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alter(String username, String product_Number, String shopping_Quantity) {
        int i = 0;
        String[][] cart = new String[6][5];
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping website", "root", "3023");
            Statement statement1 = connection.createStatement();
            Statement statement2 = connection.createStatement();
//            Statement statement3 = connection.createStatement();
            statement1.executeUpdate("update cart set Shopping_Quantity ='" + shopping_Quantity + "' where Username = '" + username + "' and Product_Number = '" + product_Number + "'");
            statement2.executeUpdate("delete from cart where Shopping_Quantity = '0'");
//            ResultSet alter1 = statement3.executeQuery("select Product_Number,Shopping_Quantity from cart where Username = '" + username + "'");
//            while (alter1.next()) {
//                for (int j = 0; j <= 1; j++) {
//                    cart[i][j] = alter1.getString(j + 1);
//                }
//                Statement statement5 = connection.createStatement();
//                ResultSet alter2 = statement5.executeQuery("select Product_Name,Product_Image,Product_Price from products_details where Product_Number = '" + cart[i][0] + "'");
//                while (alter2.next()) {
//                    for (int j = 2; j <= 4; j++) {
//                        cart[i][j] = alter2.getString(j - 1);
//                    }
//                }
//                i++;
//            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String[][] view(String username) {
        int i = 0;
        String[][] cart = new String[6][5];
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping website", "root", "3023");
            Statement statement1 = connection.createStatement();

            ResultSet view1 = statement1.executeQuery("select Product_Number,Shopping_Quantity from cart where Username = '" + username + "'");
            while (view1.next()) {
                for (int j = 0; j <= 1; j++) {
                    cart[i][j] = view1.getString(j + 1);
                }
                Statement statement2 = connection.createStatement();
                ResultSet view2 = statement2.executeQuery("select Product_Name,Product_Image,Product_Price from products_details where Product_Number = '" + cart[i][0] + "'");
                while (view2.next()) {
                    for (int j = 2; j <= 4; j++) {
                        cart[i][j] = view2.getString(j - 1);
                    }
                }
                i++;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cart;
    }

    public void buy(String username, String product_Number, String shopping_Quantity) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping website", "root", "3023");
            Statement statement1 = connection.createStatement();
            Statement statement2 = connection.createStatement();
            Statement statement3 = connection.createStatement();
            statement1.executeUpdate("update cart set Shopping_Quantity = Shopping_Quantity - '" + shopping_Quantity + "' where Username = '" + username + "' and Product_Number = '" + product_Number + "'");
            statement2.executeUpdate("delete from cart where Shopping_Quantity = '0'");
            statement3.executeUpdate("update products_details set Remaining_Quantity = Remaining_Quantity - '" + shopping_Quantity + "' where Product_Number = '" + product_Number + "'");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
