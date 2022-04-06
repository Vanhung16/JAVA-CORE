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
public class Bao extends TaiLieu {

    private int ngayPH;

    public Bao() {
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay phat hanh: ");
        ngayPH = sc.nextInt();
    }

    public static void inTieuDe() {
        TaiLieu.inTieuDe();
        System.out.printf("%10s%n", "Ngay phat hanh");
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%10s%n", ngayPH);

    }

}
