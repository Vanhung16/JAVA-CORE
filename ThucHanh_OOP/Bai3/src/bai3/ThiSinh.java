/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ThiSinh {

    protected int soBaoDanh;
    protected String hoTen;
    protected String diaChi;
    protected String uuTien;

    public ThiSinh() {
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so bao danh");
        soBaoDanh = sc.nextInt();
        System.out.print("\nNhap ho ten");
        sc.nextLine();
        hoTen = sc.nextLine();
        System.out.print("\nNhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("\nUu tien: ");
        uuTien = sc.nextLine();
    }

    public static void inTieuDe() {
        System.out.printf("%10s %10s %10s %10s", "SBD", "Ho ten", "dia chi", "uu tien");
    }

    public void xuat() {
        System.out.printf("%10s %10s %10s %10s", soBaoDanh, hoTen, diaChi, uuTien);

    }

}
