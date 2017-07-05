package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mac
 */
public class FindProductsDetails {

    //String productNumber = null, productName = null, productImage = null, productPrice = null, productQuantity = null;
    String[] details = new String[5];

    public String[] findDetails(String number) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping website", "root", "3023");
            Statement statement = connection.createStatement();
            ResultSet productsDetailsResultSet = statement.executeQuery("select * from products_details where Product_Number = '" + number + "'");
            while (productsDetailsResultSet.next()) {
                for (int i = 0; i <= 4; i++) {
                    details[i] = productsDetailsResultSet.getString(i + 1);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FindProductsDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FindProductsDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return details;
    }

}
