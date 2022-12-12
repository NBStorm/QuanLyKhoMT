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
public class CtpxController {
    public static ArrayList<ChiTietPhieuXuat> getCTPX(){
        ArrayList<ChiTietPhieuXuat> list=new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM CTPHIEUXUAT");
            while(rs.next()){
                String mactpx =rs.getString("MaCTPX");
                String mapx =rs.getString("Mapx");
                String id =rs.getString("ID");
                int amount=rs.getInt("Amount");
                double tongtien=rs.getDouble("Tongtien");
                
                ChiTietPhieuXuat ChiTietPhieuXuat=new ChiTietPhieuXuat(mactpx,mapx,id,amount,tongtien);
                list.add(ChiTietPhieuXuat);
            }
            conn.close();
        }catch(SQLException ex){
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE,null,ex);
        }
        return list;
    }
}
