/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap_treeset;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HinhTamGiac {

    private int mahinh;
    private int a, b, c;

    public HinhTamGiac() {
    }

    public HinhTamGiac(int mahinh, int a, int b, int c) {
        this.mahinh = mahinh;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getMahinh() {
        return mahinh;
    }

    public void setMahinh(int mahinh) {
        this.mahinh = mahinh;
    }

    public int getA() {

        return a;
    }

    public void setA(int a) throws Exception {
        if (a < 0) {
            throw new Exception("canh a <0. Nhap lai!");
        }
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) throws Exception {
        if (b < 0) {
            throw new Exception("Canh b <0");
        }
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) throws Exception {
        if (c >= a + b || a >= b + c || b >= a + c) {
            throw new Exception("Canh c khong thoa man la tam giac");
        }
        this.c = c;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma hinh: ");
        setMahinh(sc.nextInt());
        while (true) {
            Random rand = new Random();
            try {
                setA(rand.nextInt(100) + 1);
                setB(rand.nextInt(100) + 1);
                setC(rand.nextInt(100) + 1);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void inTD() {
        System.out.printf("%10s %10s %10s %10s%n", "MA HINH", "CANH A", "CANH B", "CANH C");
    }

    public void xuat() {
        System.out.printf("%10s %10s %10s %10s%n", getMahinh(), getA(), getB(), getC());
    }
}
