/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TaiLieu {

    protected String maTL;
    protected String teNXB;
    protected int soBPH;

    public TaiLieu() {
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ma tai lieu: ");
        maTL = sc.nextLine();
        System.out.print("\nNhap ten nxb: ");
        teNXB = sc.nextLine();
        System.out.print("\nNhap so ban phat hang: ");
        soBPH = sc.nextInt();
    }

    public static void inTieuDe() {
        System.out.printf("%15s %15s %15s", "ma tai lieu", "nha xuat ban", "ban phat hanh");
    }

    public void xuat() {
        System.out.printf("%15s %15s %15s", maTL, teNXB, soBPH);

    }
}
