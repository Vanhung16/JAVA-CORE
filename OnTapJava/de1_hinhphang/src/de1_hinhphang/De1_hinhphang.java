/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de1_hinhphang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class De1_hinhphang {

    /**
     * @param args the command line arguments
     */
    static ArrayList<HinhCN> hinh = new ArrayList<>();
    static int soHCN;
    static Scanner sc = new Scanner(System.in);

    public static Boolean checkList(HinhCN x) {
        for (HinhCN item : hinh) {
            if (item.equals(x)) {
                return true;
            }
        }
        return false;
    }

    static void nhapdl() {
        try {
            System.out.println("Nhap so hinh");
            int test = sc.nextInt();
            if (test < 0 || test > 10) {
                throw new Exception();
            }
            soHCN = test;
            for (int i = 0; i < soHCN; i++) {
                HinhCN x = new HinhCN();
                while (true) {
                    x.nhap();
                    
                    if(checkList(x)==false){
                        hinh.add(x);
                        System.out.println("thanh cong");
                               break; 
                    }
                    System.out.println("nhap lai");
                }

            }
        } catch (Exception e) {
            System.out.println("loi" + e);
//            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        nhapdl();
        HinhCN.inTieuDe();
        for (HinhCN item : hinh) {
            item.xuat();
        }
        System.out.println("Hinh cn co dien tich lon nhat:");
        HinhCN x = Collections.max(hinh, new Comparator<HinhCN>() {
            @Override
            public int compare(HinhCN o1, HinhCN o2) {
                return (int) (o1.tinhDT() - o2.tinhDT());
            }

        });
        System.out.println(x.toString());
        System.out.println("Hinh cn co dien tich lon nhat:");
        HinhCN y = Collections.min(hinh, new Comparator<HinhCN>() {
            @Override
            public int compare(HinhCN o1, HinhCN o2) {
                return (int) (o1.tinhDT() - o2.tinhDT());
            }

        });
        System.out.println(y.toString());

    }

}
