/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMS;

import java.sql.*;
/**
 *
 * @author sharvan
 */
public class DBConnection {
    
    public Connection getConnection(){
        
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ums","root","");    
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
       return con;
    }
}
