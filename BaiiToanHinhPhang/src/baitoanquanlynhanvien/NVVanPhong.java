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
public class NVVanPhong extends NhanVien{
    private double mucLuong;
    private int ngayNghi;

    public NVVanPhong() {
    }

    public NVVanPhong(float mucLuong, int ngayNghi, String maNV, String hoten, int namVaoLam) {
        super(maNV, hoten, namVaoLam);
        this.mucLuong = mucLuong;
        this.ngayNghi = ngayNghi;
    }

    public NVVanPhong(float mucLuong, int ngayNghi) {
        this.mucLuong = mucLuong;
        this.ngayNghi = ngayNghi;
    }

    public void nhaptt(){
        
    }
    
    @Override
    public String toString() {
        return "NVVanPhong{" + "mucLuong=" + mucLuong + ", ngayNghi=" + ngayNghi + '}';
    }
    @Override
    public void nhapdl(){
        super.nhapdl();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap muc luong: ");
        mucLuong = sc.nextDouble();
        System.out.print("\nNhap so ngay nghi: ");
        ngayNghi = sc.nextInt();
    }
    @Override
    public void xuatdl(){
        super.xuatdl();
        System.out.printf("%15s %15s %15s %15s%n ", mucLuong, ngayNghi, tinhLuong(), tinhPhuCap());
    }
    
    public static void intieude(){
        NhanVien.intieude();
        System.out.printf("%15s %15s %15s %15s%n", "muc luong", "ngay nghi", "Luong", "Phu cap");
    }
    @Override
    public double tinhLuong() {
       return mucLuong - ngayNghi*100000;
    }

}
