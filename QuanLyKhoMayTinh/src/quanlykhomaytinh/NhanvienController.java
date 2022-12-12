/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhomaytinh;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class NhanvienController {
    public static ArrayList<Nhanvien> getAllEmployee(){
        ArrayList<Nhanvien> list =new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM NHANVIEN");
            while(rs.next()){
                String Manv=rs.getString("Manv");
                String Name=rs.getString("Name");
                String Email=rs.getString("Email");
                Boolean Sex=rs.getBoolean("Sex");
                String Phonenumber=rs.getString("Phonenumber");
                String Address=rs.getString("Address");
                Boolean Chucvu=rs.getBoolean("Chucvu");
                String Password=rs.getString("Password");
                
                Nhanvien nhanvien =new Nhanvien(Manv,Name,Address,Email,Phonenumber,Sex,Chucvu,Password);
                list.add(nhanvien);
                
            }
            conn.close();
        }
        catch(SQLException ex){
           Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE,null,ex); 
        }
        return list;
    }
}
