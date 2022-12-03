/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhomaytinh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ASUS
 */
public class DBConnection {
    public static Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://DESKTOP-IK5BK3E:1433;databaseName=QLKHOMT";
            String user="sa";
            String pass="123456";
            connection=DriverManager.getConnection(url, user, pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }
    public static void main(String [] args){
        System.out.println(getConnection());
    }
}
