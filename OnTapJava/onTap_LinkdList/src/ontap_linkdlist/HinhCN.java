/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap_linkdlist;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HinhCN {

    private int cap1, cap2;
    private String mahinh;

    public HinhCN(int cap1, int cap2, String mahinh) {
        this.cap1 = cap1;
        this.cap2 = cap2;
        this.mahinh = mahinh;
    }

    public HinhCN() {
    }

    
    public int getCap1() {
        return cap1;
    }

    public void setCap1(int cap1) throws Exception {
        if (cap1 < 0) {
            throw new Exception("gia tri khong hop le");
        }
        this.cap1 = cap1;
    }

    public int getCap2() {
        return cap2;
    }

    public void setCap2(int cap2) throws Exception {
        if (cap2 < 0) {
            throw new Exception("gia tri khong hop le");
        }

        this.cap2 = cap2;
    }

    public String getMahinh() {
        return mahinh;
    }

    public void setMahinh(String mahinh) {
        this.mahinh = mahinh;
    }

    public static void inTD() {
        System.out.printf("%10s %10s %10s%n", "MA HINH", "CAP CANH 1", "CAP CANH 2");
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("\nNhap ma hinh: ");
        setMahinh(sc.nextLine());
        while (true) {
            try {
                setCap1(rand.nextInt(100) + 1);
                setCap2(rand.nextInt(100) + 1);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void xuat(){
        System.out.printf("%10s %10s %10s%n", getMahinh(), getCap1(), getCap2());
    }

}
