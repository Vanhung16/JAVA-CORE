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
public class KHVietNam extends KhachHang{
    private String doiTuongKhachHang;
    private int dinhMuc;

    public String getDoiTuongKhachHang() {
        return doiTuongKhachHang;
    }

    public void setDoiTuongKhachHang(String doiTuongKhachHang) {
        this.doiTuongKhachHang = doiTuongKhachHang;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
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

    public KHVietNam() {
    }


    public KHVietNam(String doiTuongKhachHang, int dinhMuc, String maKhachHang, String hoTen, String NgayHD, int soLuong, int donGia) {
        super(maKhachHang, hoTen, NgayHD, soLuong, donGia);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.dinhMuc = dinhMuc;
    }
    @Override
    public float thanhtien(){
        if(soLuong <= dinhMuc){
            return soLuong*donGia;
        }else{
            return (float) (dinhMuc*donGia + (soLuong - dinhMuc)*donGia*2.5);
        }
    }
    @Override
    public void nhapthongtin(){
        super.nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap doi tuong khach hang: ");
        doiTuongKhachHang = sc.nextLine();
        System.out.print("\nNhap dinh muc: ");
        dinhMuc = sc.nextInt();
    }
    
    public static void tieuDe(){
        KhachHang.tieuDe();
        System.out.printf(" %15s %15s %15s%n", "doi tuong khach hang", "dinh muc", "Thanh tien");

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
    public void xuattt(){
        super.xuattt();
        System.out.printf(" %15s %15s %15s%n", doiTuongKhachHang, dinhMuc, thanhtien());
    }

    @Override
    public String toString() {
        return "KHVietNam{" + "doiTuongKhachHang=" + doiTuongKhachHang + ", dinhMuc=" + dinhMuc + '}';
    }

    
    
}
