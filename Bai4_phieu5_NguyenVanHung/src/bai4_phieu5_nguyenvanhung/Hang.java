
package bai4_phieu5_nguyenvanhung;

import java.util.Scanner;


public class Hang {
    
    private String tenHang;
    private float soLuong, donGia;

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = sc.nextFloat();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextFloat();
    }
    public float tinhTongTien(){
        return soLuong*donGia;
    }
    
    public static void inTieuDe(){
        System.out.printf("-%10s -%10.1f -%10.1f -%15.0f%n", "ten hang", "so luong","don gia", "thanh tien");
    }
    public void inDL(){
        System.out.printf("%10s %10.1f %10.1f %15.0f%n", tenHang, soLuong, donGia, tinhTongTien());
    }
    
    @Override
    public String toString() {
        return "Hang{" + "tenHang=" + tenHang + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
  
    
}
