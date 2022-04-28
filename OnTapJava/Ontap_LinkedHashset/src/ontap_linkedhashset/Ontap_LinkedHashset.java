/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ontap_linkedhashset;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import static java.util.Spliterators.iterator;
import java.util.TreeSet;

public class Ontap_LinkedHashset {

    static LinkedHashSet<HinhTron> list = new LinkedHashSet<HinhTron>();
    static TreeSet<HinhTron> treeSet = new TreeSet<>(new mahinhcmp());
    static Scanner sc = new Scanner(System.in);

    public static boolean checkMaHinh(String mahinh) {
        for (HinhTron hinhTron : list) {
            if (hinhTron.getMahinh().equals(mahinh)) {
                return true;
            }
        }
        return false;
    }

    public static void kiemtra() {
        HinhTron x = null;
        LinkedList<HinhTron> linkedList = new LinkedList<HinhTron>();
        System.out.print("Nhap ma hinh: ");
        String mahinh = sc.nextLine();
        if (checkMaHinh(mahinh)) {
            System.out.println("Ma hinh da ton tai, Khong them duoc!");
        } else {
            try {
                System.out.println("Nhap ban kinh: ");
                float bankinh = sc.nextFloat();
                if (bankinh < 0) {
                    throw new Exception("ban kinh nho hon 0");
                }
                x = new HinhTron(bankinh, mahinh);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        linkedList.addAll(list);
        if (x != null) {
            linkedList.addFirst(x);
        }
        list.clear();
        list.addAll(linkedList);
        inds();
    }

    public static void sx() {
        TreeSet<HinhTron> treeSet = new TreeSet<>(new mahinhcmp());
        treeSet.addAll(list);
        list.clear();
        list.addAll(treeSet);
        inds();
    }

    public static void nhapds() {
        while (true) {
            HinhTron x = new HinhTron();
            x.nhap();
            if (x.getBankinh() == 0) {
                break;
            } else {
                list.add(x);
            }
        }
    }

    public static void inds() {
        HinhTron.inTD();
        Iterator<HinhTron> i = list.iterator();
        while (i.hasNext()) {
            HinhTron x = i.next();
            x.xuat();
        }
    }

    public static void main(String[] args) {
        nhapds();
        System.out.println("__________");
        inds();
        System.out.println("__________");
        kiemtra();
        System.out.println("__________");
        System.out.println("danh sach sau khi sap xep");
        sx();
    }

}
