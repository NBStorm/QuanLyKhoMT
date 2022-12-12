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
public class MnProductController {
    public static ArrayList<MiniProduct> getAllMnProduct(){
        ArrayList<MiniProduct> list=new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID,Name,Price,Amount FROM SANPHAM");
            while(rs.next()){
                String id =rs.getString("ID");
                String name =rs.getString("Name");
                double price=rs.getDouble("Price");
                int amount=rs.getInt("Amount");
                
                MiniProduct MiniProduct=new MiniProduct(id,name,price,amount);
                list.add(MiniProduct);
            }
            conn.close();
        }catch(SQLException ex){
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE,null,ex);
        }
        return list;
    }
}
