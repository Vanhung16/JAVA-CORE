/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    static int soSinhVien;
    static Scanner sc = new Scanner(System.in);
//    static SinhVien list[];
    static ArrayList<SinhVien> list1 = new ArrayList<SinhVien>();
//    static SinhVien findSVTop1() {
//        SinhVien max = list[0];
//        for (int i = 0; i < soSinhVien; i++) {
//            if (max.trungbinh() < list[i].trungbinh()) {
//                max = list[i];
//            }
//        }
//        return max;
//    }
//
//    static SinhVien findSVTopCuoi() {
//        SinhVien min = list[0];
//        for (int i = 0; i < list.length; i++) {
//            if (min.trungbinh() > list[i].trungbinh()) {
//                min = list[i];
//            }
//        }
//        return min;
//    }
//
//    static void sortByName() {
//        for (int i = 0; i < list.length; i++) {
//            for (int j = 1; j < list.length; j++) {
//                if (list[i].getHoTen().compareTo(list[j].getHoTen()) > 0) {
//                    SinhVien temp = list[i];
//                    list[i] = list[j];
//                    list[j] = temp;
//                } else if (list[i].getHoTen().compareTo(list[j].getHoTen()) == 0) {
//                    if (list[i].getDiemLyThuyet() < list[j].getDiemLyThuyet()) {
//                        SinhVien temp = list[i];
//                        list[i] = list[j];
//                        list[j] = temp;
//                    }
//
//                }
//            }
//        }
//    }

    static void inDS() {
        Iterator<SinhVien> sinhviens = list1.iterator();
        while (sinhviens.hasNext()) {
            System.out.println(sinhviens.next() + ",");
        }
    }

    public static void main(String[] args) {

        try {
            System.out.println("Nhap so sinh vien: ");
            soSinhVien = sc.nextInt();
//                list = new SinhVien[soSinhVien];
            for (int i = 0; i < soSinhVien; i++) {
//                    list[i] = new SinhVien();
                SinhVien x = new SinhVien();
                System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
//                    list[i].nhap();
                x.nhap();
                list1.add(x);
            }
            System.out.println("----------------danh sach sinh vien---------------- ");
//                for (SinhVien item : list) {
//                    System.out.println(item.toString());
//                }
            inDS();

            System.out.println("\n----------------danh sach sinh vien sau khi sap xep---------------- ");
//                sortByName();

//                for (SinhVien item : list) {
//                    System.out.println(item.toString());
//                }
            Collections.sort(list1, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    return o1.getHoTen().compareTo(o2.getHoTen());
                }

            });
            inDS();
            System.out.println("\n----------------sinh vien co diem cao nhat---------------- ");
//                System.out.print(findSVTop1().toString());
            SinhVien x = Collections.max(list1, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    return (int) (o1.trungbinh() - o2.trungbinh());
                }

            });
            System.out.println(x.toString());

            System.out.println("\n----------------sinh vien co diem thap nhat---------------- ");
//                System.out.print(findSVTopCuoi().toString());
            SinhVien y = Collections.min(list1, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    return (int) (o1.trungbinh() - o2.trungbinh());
                }

            });
            System.out.println(y.toString());

        } catch (Exception e) {
            System.out.println("co loi");
            e.printStackTrace();
        }

    }
}
