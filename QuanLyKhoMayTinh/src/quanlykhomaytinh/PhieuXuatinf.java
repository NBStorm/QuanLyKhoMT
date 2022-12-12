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
public class PhieuXuatinf {
    String mapx;
    String manv;
    String khachhang;
    Double tongtien;

    public PhieuXuatinf() {
    }

    public PhieuXuatinf(String mapx, String manv, String khachhang, Double tongtien) {
        this.mapx = mapx;
        this.manv = manv;
        this.khachhang = khachhang;
        this.tongtien = tongtien;
    }

    public String getMapx() {
        return mapx;
    }

    public void setMapx(String mapx) {
        this.mapx = mapx;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(String khachhang) {
        this.khachhang = khachhang;
    }

    public Double getTongtien() {
        return tongtien;
    }

    public void setTongtien(Double tongtien) {
        this.tongtien = tongtien;
    }
    public Object[] toArray(){
        return new Object[]{mapx,manv,khachhang,tongtien};
    }
}
