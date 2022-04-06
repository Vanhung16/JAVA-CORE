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
public class HangSanhSu extends HangHoa{
    private String nhaSX;
    private Ngay ngaynhapkho;

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public Ngay getNgaynhapkho() {
        return ngaynhapkho;
    }

    public void setNgaynhapkho(Ngay ngaynhapkho) {
        this.ngaynhapkho = ngaynhapkho;
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

    public HangSanhSu() {
    }

    public HangSanhSu(String nhaSX, Ngay ngaynhapkho) {
        this.nhaSX = nhaSX;
        this.ngaynhapkho = ngaynhapkho;
    }

    public HangSanhSu(String nhaSX, Ngay ngaynhapkho, String maHang, String tenHang, int soLuongTon, int donGia) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSX = nhaSX;
        this.ngaynhapkho = ngaynhapkho;
    }
    
    @Override
    public String danhGiaMucDo() {
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        
        date = c.getTime();
        c.set(ngaynhapkho.getNgay(), ngaynhapkho.getThang(), ngaynhapkho.getNam());
        if(soLuongTon > 50 && date.compareTo(c.getTime())>10){
            return "ban cham";
        }
        return "binh thuong";
    }
    @Override
    public void nhaptt(){
        super.nhaptt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay nhap kho");
        ngaynhapkho.nhap();
        System.out.print("Nhap nha san xuat: ");
        nhaSX = sc.nextLine();
        VAT = 0.1;
    }
    
     public static void inTieuDe(){
         HangHoa.inTieuDe();
        System.out.printf("%10s %10s %10s %10s%n", "ngay nhap kho", "nha sx","VAT", "muc do");
    }
     @Override
     public void xuattt(){
         super.xuattt();
        System.out.printf("%10s %10s %10s %10s%n", ngaynhapkho.toString(), nhaSX, VAT, danhGiaMucDo());

     }

    @Override
    public String toString() {
        return "HangSanhSu{" + "nhaSX=" + nhaSX + ", ngaynhapkho=" + ngaynhapkho + '}';
    }
    
    
}
