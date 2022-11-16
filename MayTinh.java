/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhomaytinh;

/**
 *
 * @author ASUS
 */
public class MayTinh {
    private String id;
    private double price;
    private int namsx;
    private String name;
    private String os;//Operating System - OS hệ điều hành
    private String cpu;
    private String gpu;
    private double khoiluong;
    private String manhinh;
    private String ram;
    private String ocung;
    private String hangsx;
    private int amount;
    public MayTinh(){
    }

    public MayTinh(String id,double price, int namsx, String name, String os, String cpu, String gpu, 
            double khoiluong, String manhinh, String ram, String ocung, String hangsx, int amount) {
        this.id=id;
        this.price = price;
        this.namsx = namsx;
        this.name = name;
        this.os = os;
        this.cpu = cpu;
        this.gpu = gpu;
        this.khoiluong = khoiluong;
        this.manhinh = manhinh;
        this.ram = ram;
        this.ocung = ocung;
        this.hangsx = hangsx;
        this.amount= amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public double getKhoiluong() {
        return khoiluong;
    }

    public void setKhoiluong(double khoiluong) {
        this.khoiluong = khoiluong;
    }

    public String getManhinh() {
        return manhinh;
    }

    public void setManhinh(String manhinh) {
        this.manhinh = manhinh;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getOcung() {
        return ocung;
    }

    public void setOcung(String ocung) {
        this.ocung = ocung;
    }

    public String getHangsx() {
        return hangsx;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Object[] toArray(){
        return new Object[]{id,name,cpu,ram,os,gpu,manhinh,ocung,khoiluong,namsx,hangsx,price,amount};
    }
}