/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_quanlykho;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
 public abstract class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected int soLuongTon;
    protected int donGia;
    protected double VAT;
    
    public abstract String danhGiaMucDo();
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }
        
    
    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, int soLuongTon, int donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }
    
    public void nhaptt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.print("Nhap so luong ton: ");
        soLuongTon = sc.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextInt();
    }
    
    public static void inTieuDe(){
        System.out.printf("%10s %10s %15s %10s %10s", "ma hang", "ten hang","so luong ton", "don gia", "VAT");
    }
     public void xuattt(){
        System.out.printf("%10s %10s %15s %10s %10s", maHang, tenHang,soLuongTon, donGia, VAT);

     }
    @Override
    public String toString() {
        return "HangHoa{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", soLuongTon=" + soLuongTon + ", donGia=" + donGia + ", VAT=" + VAT + '}';
    }
   
    
    
}
