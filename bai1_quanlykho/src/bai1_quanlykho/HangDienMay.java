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
public class HangDienMay extends HangHoa {

    private int tGianBaoHanh;
    private int conSuat;

    public int gettGianBaoHanh() {
        return tGianBaoHanh;
    }

    public void settGianBaoHanh(int tGianBaoHanh) {
        this.tGianBaoHanh = tGianBaoHanh;
    }

    public int getConSuat() {
        return conSuat;
    }

    public void setConSuat(int conSuat) {
        this.conSuat = conSuat;
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

    public HangDienMay(int tGianBaoHanh, int conSuat) {
        this.tGianBaoHanh = tGianBaoHanh;
        this.conSuat = conSuat;
    }

    public HangDienMay(int tGianBaoHanh, int conSuat, String maHang, String tenHang, int soLuongTon, int donGia) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.tGianBaoHanh = tGianBaoHanh;
        this.conSuat = conSuat;
    }

    public HangDienMay() {
    }

    @Override
    public void nhaptt() {
        super.nhaptt();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh: ");
        tGianBaoHanh = sc.nextInt();
        System.out.print("Nhap cong suat: ");
        conSuat = sc.nextInt();
        VAT = 0.1;
    }

    @Override
    public void xuattt() {
        super.xuattt();
        System.out.printf("%20s %10s %10s%n", tGianBaoHanh, conSuat, danhGiaMucDo());

    }

    public static void inTieuDe() {
        HangHoa.inTieuDe();
        System.out.printf("%20s %10s %10s%n", "thoi gian bao hang", "cong suat", "Muc do");

    }

    @Override
    public String danhGiaMucDo() {
        if (soLuongTon < 3) {
            return "Ban duoc";
        }
        return "Kho ban";
    }

    @Override
    public String toString() {
        return "HangDienMay{" + "tGianBaoHanh=" + tGianBaoHanh + ", conSuat=" + conSuat + '}';
    }

}
