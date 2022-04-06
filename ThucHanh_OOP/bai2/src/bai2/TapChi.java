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
public class TapChi extends TaiLieu {

    private int soPH;
    private int thangPH;

    public TapChi() {
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap so phat hanh:");
        soPH = sc.nextInt();
        System.out.print("\nNhap thang phat hanh:");
        thangPH = sc.nextInt();

    }

    public static void inTieuDe() {
        TaiLieu.inTieuDe();
        System.out.printf("%10s %10s%n", "phat hanh so", "phat hanh thang");
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%10s %10s%n", soPH, thangPH);

    }

}
