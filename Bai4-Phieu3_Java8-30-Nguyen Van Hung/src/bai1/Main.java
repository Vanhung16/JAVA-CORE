/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    static ArrayList<NhanVien> list = new ArrayList<NhanVien>();
    static Scanner sc = new Scanner(System.in);
    static int soNhanVien;

    static void nhapdl(NhanVien x) throws Exception {

        System.out.print("\nNhap so san pham: ");
        x.setSoSP(sc.nextInt());
        System.out.print("Nhap ma nhan vien: ");
        String manv = sc.nextLine();
        x.setMaNV(sc.nextLine());

    }

    public static void main(String[] args) {
        try {
            System.out.println("Nhap so nhan vien: ");
            soNhanVien = sc.nextInt();
            if (soNhanVien < 0) {
                throw new Exception("so nhan vien > 0");
            }
            for (int i = 0; i < soNhanVien; i++) {
                NhanVien x = new NhanVien();
                System.out.println("Nhap thong tin nhan vien thu " + (i + 1));
                nhapdl(x);
                list.add(x);
            }
            System.out.println("Thong tin nhan vien ");

            NhanVien.xuatTieuDe();
            for (int i = 0; i < soNhanVien; i++) {
                list.get(i).inDL();
            }
        } catch (Exception e) {
            System.out.println("co loi" + e);
        }
    }
}
