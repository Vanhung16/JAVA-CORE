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
public class CongNhan extends CanBo {

    private int bac;

    public CongNhan() {
    }

    @Override
    public void nhap() throws Exception{
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("\nNhap bac: ");
        int x = sc.nextInt();
        if(x<0) throw new Exception("loi");
        bac = x;
    }

    public static void inTieuDe() {
        CanBo.inTieuDe();
        System.out.printf("%10s%n", "bac");
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%10s%n", bac);

    }

}
