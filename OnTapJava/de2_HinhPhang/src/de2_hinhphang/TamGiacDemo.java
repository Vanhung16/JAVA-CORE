package de2_hinhphang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class TamGiacDemo {

    static ArrayList<TamGiac> list = new ArrayList<TamGiac>();
    static int soHP;
    static Scanner sc = new Scanner(System.in);

    public static void nhapDS() {
        try {
            System.out.print("Nhap so hinh phang: ");
            int temp = sc.nextInt();
            if (temp < 0 || temp > 10) {
                throw new Exception("Loi nhap so hinh phang");
            }
            soHP = temp;
            for (int i = 0; i < soHP; i++) {
                TamGiac a = new TamGiac();
                a.nhap();
                list.add(a);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void xuatDS(){
        TamGiac.inTieuDe();
        for (TamGiac tamGiac : list) {
            tamGiac.xuat();
        }
    }

    public static void findMaxCV(){
        TamGiac x = Collections.max(list, new Comparator<TamGiac>(){
            @Override
            public int compare(TamGiac o1, TamGiac o2) {
                return o1.tinhCV()-o2.tinhCV();
            }
        });
        System.out.println("\n------------------------------------");
        TamGiac.inTieuDe();
        x.xuat();
    }
    public static void findMinCV(){
        TamGiac x = Collections.min(list, new Comparator<TamGiac>(){
            @Override
            public int compare(TamGiac o1, TamGiac o2) {
                return o1.tinhCV()-o2.tinhCV();
            }
        });
        System.out.println("\n------------------------------------");
        TamGiac.inTieuDe();
        x.xuat();
    }
    public static void main(String[] args) {
        nhapDS();
        xuatDS();
        findMaxCV();
        findMinCV();
    }

}
