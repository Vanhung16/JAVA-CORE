/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1_quanlykho;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1_quanlykho {

    static HangHoa list[];
    static Scanner sc = new Scanner(System.in);
    static int soHangHoa;

    static void themHH() {
        System.out.println("Nhap so hang hoa");
        soHangHoa = sc.nextInt();
        list = new HangHoa[soHangHoa];
        for (int i = 0; i < soHangHoa; i++) {
            System.out.println("Nhap hang hoa thu" + (i + 1));

            System.out.println("Lua chon!");
            System.out.println("\n1. hang dien may\n2. hang thuc pham\n3. hang sanh su");
            int choose = sc.nextInt();

            switch (choose) {
                case 1:
                    list[i] = new HangDienMay();
                    break;
                case 2:
                    list[i] = new HangThucPham();
                    break;
                case 3:
                    list[i] = new HangSanhSu();
                    break;
            }
            list[i].nhaptt();

        }
    }

    static void xuatds() {

        System.out.println("Danh sach san pham hang dien may");
        System.out.println("---------------------------------");
        HangDienMay.inTieuDe();
        for (int i = 0; i < soHangHoa; i++) {
            if (list[i] instanceof HangDienMay) {
                list[i].xuattt();
            }
        }
        System.out.println("Danh sach san pham hang sanh su");
        System.out.println("---------------------------------");
        HangDienMay.inTieuDe();
        for (int i = 0; i < soHangHoa; i++) {
            if (list[i] instanceof HangSanhSu) {
                list[i].xuattt();
            }
        }
        System.out.println("Danh sach san pham hang thuc pham");
        System.out.println("---------------------------------");
        HangDienMay.inTieuDe();
        for (int i = 0; i < soHangHoa; i++) {
            if (list[i] instanceof HangThucPham) {
                list[i].xuattt();
            }
        }
    }

    public static void main(String[] args) {
        themHH();
        xuatds();
    }

}
