/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitoanquanlynhanvien;

import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static NhanVien nhanVien[];
    static double tongLuong = 0.0f;
    static int soNhanVien, loaiNhanVien; 
    
    static void nhapds(){
        System.out.print("Nhap so nhan vien: ");
        soNhanVien = sc.nextInt();
        nhanVien = new NhanVien[soNhanVien];
        for(int i = 0 ; i < soNhanVien ; i++){
        System.out.print("\nNhap thong tin nhan vien thu "+(i+1));
        System.out.print("\nNhap lua chon nhan vien: ");
        System.out.print("\n1. Nhan vien van phong\n2. Nhan vien san xuat \n");
        loaiNhanVien = sc.nextInt();
        switch(loaiNhanVien){
            case 1:
                nhanVien[i] = new NVVanPhong();
                break;
            case 2:
                nhanVien[i] = new NVSanXuat();
                break;
        }
        nhanVien[i].nhapdl();
        tongLuong += nhanVien[i].tinhLuong()+nhanVien[i].tinhPhuCap();
        }
    }
    static void xuatds(){
        System.out.println("danh sach thong tin nhan vien san xuat");
        NVSanXuat.intieude();
        for (NhanVien item : nhanVien) {
            if(item instanceof NVSanXuat){
                item.xuatdl();
            }
        }
        NVVanPhong.intieude();
        System.out.println("danh sach thong tin nhan vien van phong");
        for (NhanVien item : nhanVien) {
            if(item instanceof NVSanXuat){
                item.xuatdl();
            }
        }
        System.out.println("------------------------------------------");
        System.out.println("tong Luong cong ty phai tra cho nhan vien moi thang la: "+tongLuong);
    }
    public static void main(String[] args) {
        nhapds();
        xuatds();
    }
}
