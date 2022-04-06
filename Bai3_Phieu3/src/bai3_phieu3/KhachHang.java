/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3_phieu3;


public class KhachHang {
    String makh;
    String ten;
    int soluong;
    int dongia;
    int dinhmuc;
    NgayHD date;

    public KhachHang(String makh, String ten, int soluong, int dongia, int dinhmuc, NgayHD date) {
        this.makh = makh;
        this.ten = ten;
        this.soluong = soluong;
        this.dongia = dongia;
        this.dinhmuc = dinhmuc;
        this.date = date;
    } 

    public KhachHang() {
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    public NgayHD getDate() {
        return date;
    }

    public void setDate(NgayHD date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "makh=" + makh + ", ten=" + ten + ", soluong=" + soluong + ", dongia=" + dongia + ", dinhmuc=" + dinhmuc + ", date=" + date + '}';
    }
    
    
    
}
