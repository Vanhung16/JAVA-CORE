/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ontap_linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import static java.util.Spliterators.iterator;

public class Ontap_LinkedHashset {

    static LinkedHashSet<HinhTron> list = new LinkedHashSet<>();
    static Scanner sc = new Scanner(System.in);

    public static void kiemtra() {
        System.out.print("Nhap ma hinh: ");
        Boolean bool = true;
        HinhTron x = null;
        String mahinh = sc.nextLine();

        for (HinhTron hinhTron : list) {
            if (hinhTron.getMahinh().compareTo(mahinh) == 0) {
                bool = true;
                return;
            } else {
                bool = false;
            }
        }
        if (bool == true) {
            System.out.println("Khong them duoc");
        } else {
            x.setMahinh(mahinh);
            while (true) {
                try {
                    System.out.print("Nhap ban kinh: ");
                    x.setBankinh(sc.nextFloat());
                    break;
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
//        if (x != null) {
//            list.add(x);
//        }
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
    }

}
