/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CanBo {

    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;

    public CanBo() {
    }

    public void nhap() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("\nNhap nam sinh: ");
        namSinh = sc.nextInt();
        System.out.print("\nNhap gioi tinh: ");
        sc.nextLine();
        gioiTinh = sc.nextLine();

        System.out.print("\nNhap dia chi: ");
        diaChi = sc.nextLine();
    }

    public static void inTieuDe() {
        System.out.printf("%15s %15s %15s %15s ", "ho ten", "nam sinh", "gioi tinh", "dia chi");
    }

    public void xuat() {
        System.out.printf("%15s %15s %15s %15s ", hoTen, namSinh, gioiTinh, diaChi);
    }

   

    public boolean equals(String hoTen) {
        
//        final CanBo other = (CanBo) obj;
        if (!Objects.equals(this.hoTen, hoTen)) {
            return false;
        }
        return true;
    }

}
