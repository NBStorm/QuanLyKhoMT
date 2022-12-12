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
public class ChiTietPhieuXuat {
    String mactpx;
    String mapx;
    String id;
    int amount;
    Double tongtien;

    public ChiTietPhieuXuat() {
    }

    public ChiTietPhieuXuat(String mactpx, String mapx, String id, int amount, Double tongtien) {
        this.mactpx = mactpx;
        this.mapx = mapx;
        this.id = id;
        this.amount = amount;
        this.tongtien = tongtien;
    }

    public String getMactpx() {
        return mactpx;
    }

    public void setMactpx(String mactpx) {
        this.mactpx = mactpx;
    }

    public String getMapx() {
        return mapx;
    }

    public void setMapx(String mapx) {
        this.mapx = mapx;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getTongtien() {
        return tongtien;
    }

    public void setTongtien(Double tongtien) {
        this.tongtien = tongtien;
    }
    public Object[] toArray(){
        return new Object[]{mactpx,mapx,id,amount,tongtien};
    }
}
