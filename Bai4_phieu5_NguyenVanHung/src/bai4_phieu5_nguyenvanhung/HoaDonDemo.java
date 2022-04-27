/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4_phieu5_nguyenvanhung;


public class HoaDonDemo {
    public static void main(String[] args) {
        HoaDon x = new HoaDon();
        System.out.println("Nhập 1 hoa don");
        x.Nhap();
        System.out.println("xuat 1 hoa don");
               System.out.printf("%10s %10s %10s %15s %n", "ten hang", "so luong","don gia", "thanh tien");
        x.inHD();
        
    }
}
