/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author justine
 */
public class Tables {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pst = null;

        conn = ConnectionProvider.getConn();
        try {
            //pst = conn.prepareStatement("CREATE TABLE appuser(appuser_pk int AUTO_INCREMENT PRIMARY KEY, userRole VARCHAR(50), name VARCHAR(200), mobileNumber VARCHAR(50), email VARCHAR(200), password VARCHAR(50), address VARCHAR(200), status VARCHAR(50))");
           // pst = conn.prepareStatement("insert into appuser(userRole, name, mobileNumber, email, password, address, status) values ('supperAdmin', 'Super Admin', '0704269165', 'superadmin@gmail.com', 'admin', 'kenya', 'Active')");
           //pst = conn.prepareStatement("create table category (category_pk int auto_increment primary key, name varchar(200))");
           //pst = conn.prepareStatement("create table product(product_pk int auto_increment primary key, name varchar(200), qty int,price int, description varchar(500), category_fk int, categoryName varchar(200))");
           //pst = conn.prepareStatement("create table customer(customer_pk int auto_increment primary key, name varchar(200), mobileNumber varchar(50), email varchar(200))");
           pst = conn.prepareStatement("create table orderDetails(order_pk int auto_increment primary key, orderId varchar(200), customer_fk int, orderDate varchar(50), totalPaid int)");
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "table created successfully");
        } catch (SQLException ex) {
            Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
