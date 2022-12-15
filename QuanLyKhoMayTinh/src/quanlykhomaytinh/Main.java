/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhomaytinh;

/**
 *
 * @author ASUS
 */
public class Main {
    public static AdminView adv=new AdminView();
    public static NhanVienView nvv=new NhanVienView();
    public static void main(String[] args) {
       Login login= new Login();
       login.setVisible(true);
    }
}
