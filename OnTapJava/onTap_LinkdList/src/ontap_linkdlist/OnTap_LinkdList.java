/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ontap_linkdlist;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import static java.util.Spliterators.iterator;

/**
 *
 * @author Admin
 */
public class OnTap_LinkdList {

    static LinkedList<HinhCN> linkedList = new LinkedList<>();
    static int sohinh;
    static Scanner sc = new Scanner(System.in);

    static boolean checkMaHinh(String mahinh) {
        for (HinhCN hinhCN : linkedList) {
            if (hinhCN.getMahinh().equals(mahinh)) {
                return true;
            }
        }
        return false;
    }

    static void nhapds() {
        try {
            System.out.print("Nhap so hinh: ");
            int temp = sc.nextInt();
            if (temp < 0 || temp > 5) {
                throw new Exception("Gia tri khong hop le");
            }
            sohinh = temp;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < sohinh; i++) {
            while (true) {
                HinhCN x = new HinhCN();
                x.Nhap();
                if (checkMaHinh(x.getMahinh())) {
                    System.out.print("Ma hinh da ton tai");
                } else {
                    linkedList.add(x);
                    break;
                }
            }
        }

    }

    static void xuatds() {
        HinhCN.inTD();
        for (HinhCN hinhCN : linkedList) {
            hinhCN.xuat();
        }
    }

    static void chinhSua() {
        String mahinh;
        int vitri = -1;
        Random rand = new Random();
        System.out.print("Nhap ma hinh:");
        sc.nextLine();
        mahinh = sc.nextLine();
        for (HinhCN hinhCN : linkedList) {
            if (hinhCN.getMahinh().equals(mahinh)) {
                vitri = linkedList.indexOf(hinhCN);
                System.out.println(vitri);
                break;
            }
        }
        if (vitri != -1) {
            System.out.println(vitri);
            HinhCN x = new HinhCN(rand.nextInt(100) + 1, rand.nextInt(100) + 1, mahinh);
            linkedList.set(vitri, x);
        } else {
            System.out.println("Khong co ma hinh nhu v");
        }
    }

    static void viewSMax() {
        HinhCN x = Collections.max(linkedList, new Comparator<HinhCN>() {
            @Override
            public int compare(HinhCN o1, HinhCN o2) {
                return o1.getCap1() * o1.getCap2() - o2.getCap1() * o2.getCap2();
            }
        });
        HinhCN.inTD();
        x.xuat();

    }

    public static void main(String[] args) {
        nhapds();
        System.out.println("_---------------_");
        xuatds();
        System.out.println("_---------------_");
        chinhSua();
        System.out.println("Danh sach sau khi sua");
        xuatds();
        System.out.println("Hinh chu nhat co dien tich lon nhat:");
        viewSMax();

    }

}
