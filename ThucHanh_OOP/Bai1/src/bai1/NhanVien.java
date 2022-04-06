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
public class NhanVien extends CanBo {

    private String congViec;

    public NhanVien() {
    }

    @Override
    public void nhap() throws Exception {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap cong viec nhan vien: ");
        congViec = sc.nextLine();
    }

    public static void inTieuDe() {
        CanBo.inTieuDe();
        System.out.printf("%15s%n", "Cong viec");
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%15s%n", congViec);

    }

}
