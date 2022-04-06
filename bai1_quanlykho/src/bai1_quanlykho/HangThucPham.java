/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_quanlykho;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HangThucPham extends HangHoa {

    private Ngay ngaySX;
    private Ngay ngayHetHan;
    private String nhaCC;

    public HangThucPham() {
    }

    public HangThucPham(Ngay ngaySX, Ngay ngayHetHan, String nhaCC) {
        this.ngaySX = ngaySX;
        this.ngayHetHan = ngayHetHan;
        this.nhaCC = nhaCC;
    }

    public HangThucPham(Ngay ngaySX, Ngay ngayHetHan, String nhaCC, String maHang, String tenHang, int soLuongTon, int donGia) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySX = ngaySX;
        this.ngayHetHan = ngayHetHan;
        this.nhaCC = nhaCC;
    }

    public Ngay getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Ngay ngaySX) {
        this.ngaySX = ngaySX;
    }

    public Ngay getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Ngay ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        this.nhaCC = nhaCC;
    }

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

    

    @Override
    public void nhaptt() {
        super.nhaptt();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ngay sx");
        ngaySX.nhap();
        System.out.print("\nNhap het han");
        ngayHetHan.nhap();
        System.out.print("\nNhap Nha san xuat");
        nhaCC = sc.nextLine();
        VAT = 0.05;
    }

    public static void inTieuDe() {
        HangHoa.inTieuDe();
        System.out.printf("%10s %10s  %10s %10s%n", "ngay SX", "Ngay het han", "nha cung cap", "muc do");

    }


    @Override
    public void xuattt() {
        super.xuattt();
        System.out.printf("%10s %10s %10s %10s%n", ngaySX.toString(), ngayHetHan.toString(), nhaCC, danhGiaMucDo());

    }

    @Override
    public String danhGiaMucDo() {
        Date date = new Date(); // lay ngay hien tai
        Calendar c = Calendar.getInstance();
        date = c.getTime();
        
        c.set(ngayHetHan.getNgay(),ngayHetHan.getThang(),ngayHetHan.getNam());
        if(soLuongTon > 0 && date.compareTo(c.getTime())>0){
            return "Kho ban";
            
        }return "binh thuong";
    }

    @Override
    public String toString() {
        return "HangThucPham{" + "ngaySX=" + ngaySX + ", ngayHetHan=" + ngayHetHan + ", nhaCC=" + nhaCC + '}';
    }

}
