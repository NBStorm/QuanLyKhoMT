/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhomaytinh;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import quanlykhomaytinh.MayTinh;

/**
 *
 * @author ASUS
 */
public class ProductController {
    public static ArrayList<MayTinh> getAllProduct(){
        ArrayList<MayTinh> list=new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM SANPHAM");
            while(rs.next()){
                String id =rs.getString("ID");
                String name =rs.getString("Name");
                String cpu =rs.getString("CPU");
                String ram =rs.getString("RAM");
                String os =rs.getString("HĐH");
                String gpu =rs.getString("GPU");
                String manhinh =rs.getString("Screen");
                String ocung=rs.getString("Hard Disk");
                double khoiluong=rs.getDouble("Weight");
                int namsx=rs.getInt("Year");
                String nhasx=rs.getString("Producer");
                double price=rs.getDouble("Price");
                int amount=rs.getInt("Amount");
                
                MayTinh maytinh=new MayTinh(id,price,namsx,name,os,cpu,gpu,khoiluong,manhinh,ram,ocung,nhasx,amount);
                list.add(maytinh);
            }
            conn.close();
        }catch(SQLException ex){
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE,null,ex);
        }
        return list;
    }
    
}
