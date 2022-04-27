/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
//[a,b,c,d]
public class HinhVuong extends DaGiac {

    final int canh = 4;
    private int doDai;

    @Override
    public int tinhDT() {
        return doDai * doDai;
    }

    @Override
    public void nhapDL() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        super.dsCanh = new int[4];
        System.out.print("Nhap ma hinh: ");
        mahinh = sc.nextLine();
        System.out.print("Nhap ten hinh: ");
        tenhinh = sc.nextLine();
        System.out.println("Nhap do dai canh cua hinh vuong: ");
        while (true) {
            try {
                doDai = rand.nextInt(100) + 20;
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        for (int i = 0; i < dsCanh.length; i++) {
            dsCanh[i] = doDai;
        }
    }

    public static void inTD() {
        System.out.printf("%10s %10s %10s%n", "CANH", "DIEN TICH", "CHU vi");

    }

    public void output() {
        System.out.printf("%10s %10s %10s%n", doDai, tinhDT(), tinhCV());
    }

    @Override
    public String toString() {
        return "HinhVuong{" + "canh=" + doDai + ", dien tich=" + tinhDT() + ", chu vi=" + tinhCV() + '}';
    }

}
