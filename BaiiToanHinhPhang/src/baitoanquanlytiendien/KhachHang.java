/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitoanquanlytiendien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhachHang {
    protected String maKhachHang;
    protected String hoTen;
    protected String NgayHD;
    protected int soLuong;
    protected int donGia;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String hoTen, String NgayHD, int soLuong, int donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.NgayHD = NgayHD;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
    public float thanhtien(){
        return 0;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayHD() {
        return NgayHD;
    }

    public void setNgayHD(String NgayHD) {
        this.NgayHD = NgayHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
    public int ngayTao(){
        return 0;
    }
    
    public int thangTao(){
        return 0;
    }
    
    public int namTao(){
        return 0;
    }
    
    public void nhapthongtin(){
        System.out.println("Nhap thong tin khach hang");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ma khach hang: ");
        maKhachHang = sc.nextLine();
        System.out.print("\nNhap ho ten khach hang: ");
        hoTen = sc.nextLine();
        System.out.print("\nNhap ngay hoa don: ");
        NgayHD = sc.nextLine();
        System.out.print("\nNhap so luong dien tieu thu: ");
        soLuong = sc.nextInt();
        System.out.print("\nNhap don gia: ");
        donGia = sc.nextInt();
    }
   
    public static void tieuDe() {
        System.out.printf("%10s %10s %10s %10s %10s", "Ma KH", "Ho ten", "Ngay ra HD", "So luong", "Don gia");
    }
    public void xuattt(){
        System.out.printf("%10s %10s %10s %10s %10s", maKhachHang, hoTen, NgayHD, soLuong, donGia);
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKhachHang=" + maKhachHang + ", hoTen=" + hoTen + ", NgayHD=" + NgayHD + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
    
}
