/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitoanquanlynhanvien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NVSanXuat extends NhanVien{
    private int sanPham;

    public NVSanXuat(int sanPham, String maNV, String hoten, int namVaoLam) {
        super(maNV, hoten, namVaoLam);
        this.sanPham = sanPham;
    }

    public NVSanXuat(int sanPham) {
        this.sanPham = sanPham;
    }

    public NVSanXuat() {
    }

    public int getSanPham() {
        return sanPham;
    }

    public void setSanPham(int sanPham) {
        this.sanPham = sanPham;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }

    public static double getTongLuong() {
        return tongLuong;
    }

    public static void setTongLuong(double tongLuong) {
        NhanVien.tongLuong = tongLuong;
    }

    @Override
    public double tinhLuong() {
        return sanPham*100000;
    }
    @Override
    public void nhapdl(){
        super.nhapdl();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap so san pham: ");
        sanPham = sc.nextInt();
    }
    @Override
    public void xuatdl(){
        super.xuatdl();
        System.out.printf("%15s %15s %15s%n ", sanPham, tinhLuong(), tinhPhuCap());
    }
    public static void intieude(){
        NhanVien.intieude();
        System.out.printf("%15s %15s %15s%n", "san pham", "luong", "Phu cap");
    }
    @Override
    public String toString() {
        return "NVSanXuat{" + "sanPham=" + sanPham + '}';
    }

}
