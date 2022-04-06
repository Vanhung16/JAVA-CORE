/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KySu extends CanBo {

    private String nganhQuanLy;

    public KySu() {
    }

    @Override
    public void nhap() throws Exception {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nnhap nganh quan ly: ");
        nganhQuanLy = sc.nextLine();
    }

    public static void inTieuDe() {
        CanBo.inTieuDe();
        System.out.printf("%15s%n", "Nganh quan ly");
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%15s%n", nganhQuanLy);

    }
}
