/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhomaytinh;

/**
 *
 * @author ASUS
 */
public class Nhanvien {
    public String Manv;
    private String Name;
    private String Address;
    private String Email; 
    private String Phonenumber;
    private Boolean Sex;
    private Boolean Chucvu;
    public String Password;

    public Nhanvien() {
    }

    
    public Nhanvien(String Manv, String Name, String Address, String Email, String Phonenumber, Boolean Sex, Boolean Chucvu, String Password) {
        this.Manv = Manv;
        this.Name = Name;
        this.Address = Address;
        this.Email = Email;
        this.Phonenumber = Phonenumber;
        this.Sex = Sex;
        this.Chucvu=Chucvu;
        this.Password=Password;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String Phonenumber) {
        this.Phonenumber = Phonenumber;
    }

    public Boolean getSex() {
        return Sex;
    }

    public void setSex(Boolean Sex) {
        this.Sex = Sex;
    }

    public Boolean getChucvu() {
        return Chucvu;
    }

    public void setChucvu(Boolean Chucvu) {
        this.Chucvu = Chucvu;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    public Object[] toArray(){
        return new Object[]{Manv,Name,Address,Email,Phonenumber,Sex,Chucvu,Password};
    }
    
}

