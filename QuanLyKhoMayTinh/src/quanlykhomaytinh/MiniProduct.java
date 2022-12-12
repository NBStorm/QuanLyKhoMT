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
public class MiniProduct {
    String id;
    String name;
    Double gia;
    int amount;//So luong

    public MiniProduct() {
    }

    public MiniProduct(String id, String name, Double gia, int amount) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.amount = amount;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Object[] toArray(){
        return new Object[]{id,name,gia,amount};
    }
}
