/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ontap_treeset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class OnTap_TreeSet {

    static TreeSet<HinhTamGiac> treeSet = new TreeSet<>(new mahinhcmp());
    static LinkedList<HinhTamGiac> linkedList = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    public static boolean checkMaHinh(int mahinh) {
        linkedList.addAll(treeSet);
        for (HinhTamGiac hinhTamGiac : linkedList) {
            if (hinhTamGiac.getMahinh() == mahinh) {
                return true;
            }
        }
        return false;
    }

    public static void nhapds() {
        while (true) {
            HinhTamGiac x = new HinhTamGiac();
            x.nhap();
            if (x.getMahinh() == 0) {
                System.out.println("ma hinh = 0");
                break;
            } else {
                treeSet.add(x);
            }
        }
    }

    public static void chen() {
        linkedList.addAll(treeSet);
        treeSet.clear();
        System.out.print("Nhap vi tri can chen" + "[" + 1 + "," + (linkedList.size() + 1) + "]" + ": ");
        int vitri = sc.nextInt();
        System.out.println("Danh sach sau khi chen: ");

        HinhTamGiac x = new HinhTamGiac();
        while (true) {
            x.nhap();
            if (checkMaHinh(x.getMahinh())) {
                System.out.println("Ban nhap khong dung");
            } else {
                linkedList.add(vitri, x);
                break;
            }
        }
//        treeSet.addAll(linkedList);
        HinhTamGiac.inTD();
        for (HinhTamGiac hinhTamGiac : linkedList) {
            hinhTamGiac.xuat();
        }
    }

    public static void xuatDS() {
        Iterator<HinhTamGiac> i = treeSet.iterator();
        HinhTamGiac.inTD();
        while (i.hasNext()) {
            HinhTamGiac next = i.next();
            next.xuat();
        }
    }

    public static void main(String[] args) {
        nhapds();
        System.out.println("Danh sach");
        xuatDS();
        chen();
    }

}
