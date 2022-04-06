/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitoanquanlynhanvien;

import java.util.Date;
import java.util.Scanner;


abstract class NhanVien {
    protected String maNV;
    protected String hoten;
    protected int namVaoLam;
    static double tongLuong;
    final double PHUCAP_BANDAU = 100000;
    
    abstract public double tinhLuong();

    public NhanVien(String maNV, String hoten, int namVaoLam) {
        this.maNV = maNV;
        this.hoten = hoten;
        this.namVaoLam = namVaoLam;
    }

    public NhanVien() {
    }
    
    protected double tinhPhuCap(){
        return PHUCAP_BANDAU + (2022-namVaoLam)*20000;
    }
    
    public void nhapdl(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ma nhan vien");
        maNV = sc.nextLine();
        System.out.print("\nNhap ho ten: ");
        hoten = sc.nextLine();
        System.err.print("\nNhap nam vao lam: ");
        namVaoLam = sc.nextInt();
    }
    
    public static void intieude(){
        System.out.printf("%15s %15s %15s", "ma nhan vien", "ho ten", "nam vao lam");
    }
    
    public void xuatdl(){
        System.out.printf("%15s %15s %15s", maNV, hoten, namVaoLam);
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoten=" + hoten + ", namVaoLam=" + namVaoLam + ", PHUCAP_BANDAU=" + PHUCAP_BANDAU + '}';
    }
}
