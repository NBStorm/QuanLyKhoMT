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
public class PhieuXuatController {
    public static ArrayList<PhieuXuatinf> getPX(){
        ArrayList<PhieuXuatinf> list=new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM PHIEUXUAT");
            while(rs.next()){
                String mapx =rs.getString("Mapx");
                String manv =rs.getString("Manv");
                String khachhang =rs.getString("KhachHang");
                double tongtien=rs.getDouble("Tongtien");
                
                PhieuXuatinf PhieuXuatinf=new PhieuXuatinf(mapx,manv,khachhang,tongtien);
                list.add(PhieuXuatinf);
            }
            conn.close();
        }catch(SQLException ex){
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE,null,ex);
        }
        return list;
    }
}
