/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {

    static Scanner sc = new Scanner(System.in);
    static int choose;
    static ArrayList<TaiLieu> list = new ArrayList<TaiLieu>();
    static String ck;

    static TaiLieu nhaptt() {
        TaiLieu x = new TaiLieu();
        System.out.println("lua chon");
        int choose1 = 0;
        System.out.println("\n1.nhap sach\n2.nhap tap chi\n3.nhap bao");
        try {
            int number = sc.nextInt();

            if (number < 0) {
                throw new Exception();
            }
            choose1 = number;
        } catch (Exception e) {
            System.out.println("loi");
            e.printStackTrace();
        }
        switch (choose1) {
            case 1:
                x = new Sach();
                break;
            case 2:
                x = new TapChi();
                break;
            case 3:
                x = new Bao();
                break;
        }
        x.nhap();
        return x;
    }

    public static void inDS() {
        System.out.println("Danh sach tai lieu sach");
        for (TaiLieu item : list) {
            if (item instanceof Sach) {
                item.xuat();
            }
        }
        System.out.println("Danh sach tai lieu tap chi");
        for (TaiLieu item : list) {
            if (item instanceof TapChi) {
                item.xuat();
            }
        }
        System.out.println("Danh sach tai lieu bao");
        for (TaiLieu item : list) {
            if (item instanceof Bao) {
                item.xuat();
            }
        }
    }
   

    public static void main(String[] args) {
        while (choose <= 4 ) {
            System.out.println("lua chon");
            System.out.println("\n1.nhap thong tin tai lieu\n2.hien thi thong tin tai lieu\n3.tim kiem tai lieu theo loai\n4.thoat khoi chuong trinh");
            try {
                int number = sc.nextInt();
                if (number < 0 || number > 4) {
                    throw new Exception();
                }
                choose = number;
            } catch (Exception e) {
                System.out.println("loi");
                e.printStackTrace();
            }

            switch (choose) {
                case 1:
                    list.add(nhaptt());
                    break;
                case 2:
                    inDS();
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }

        }
    }

}
