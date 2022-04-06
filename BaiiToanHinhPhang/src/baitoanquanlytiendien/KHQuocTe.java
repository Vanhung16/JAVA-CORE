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
public class KHQuocTe extends KhachHang{
    private String quocTich;

    public KHQuocTe() {
    }

    public KHQuocTe(String quocTich) {
        this.quocTich = quocTich;
    }

    public KHQuocTe(String quocTich, String maKhachHang, String hoTen, String NgayHD, int soLuong, int donGia) {
        super(maKhachHang, hoTen, NgayHD, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
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
    
    @Override
    public float thanhtien(){
        return soLuong*donGia;
    }
    
    @Override
    public void nhapthongtin(){
        super.nhapthongtin();
        System.out.print("\nNhap quoc tich: ");
        Scanner sc = new Scanner(System.in);
        quocTich = sc.nextLine();
                
    }
    public static void tieuDe(){
        KhachHang.tieuDe();
        System.out.printf(" %10s %10s%n", "quoc tich", "Thanh tien");
        System.out.println();
    }
    @Override
    public void xuattt(){
        super.xuattt();
        System.out.printf(" %10s %10s%n", quocTich, thanhtien());

    }
    @Override
    public int ngayTao() {
        String[] ngay = NgayHD.split("/");
        return Integer.parseInt(ngay[0]);
    }
    @Override
    public int thangTao(){
        String[] ngay = NgayHD.split("/");
        return Integer.parseInt(ngay[1]);
    }
    @Override
    public int namTao(){
        String[] ngay = NgayHD.split("/");
        return Integer.parseInt(ngay[2]);
    }
    @Override
    public String toString() {
        return "KHQuocTe{" + "quocTich=" + quocTich + '}';
    }
    
}
