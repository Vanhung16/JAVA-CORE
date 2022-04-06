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
public class Sach extends TaiLieu {

    private String tenTG;
    private int soTrang;

    public Sach() {
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ten tg: ");
        tenTG = sc.nextLine();
        System.out.print("\nNhap so trang: ");
        soTrang = sc.nextInt();
    }

    public static void inTieuDe() {
        TaiLieu.inTieuDe();
        System.out.printf("%15s %15s%n", "tac Gia", "so trang");
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%15s %15s%n", tenTG, soTrang);

    }

}
