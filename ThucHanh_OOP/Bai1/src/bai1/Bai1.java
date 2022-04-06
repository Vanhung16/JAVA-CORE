/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<CanBo> list = new ArrayList<CanBo>();
    static int soCanBo;
    static Scanner sc = new Scanner(System.in);
    static int choose;

    static void nhapds() throws Exception {
        System.out.print("\nNhap so can bo: ");
        int x = sc.nextInt();
        if (x < 0) {
            throw new Exception();
        }
        soCanBo = x;

        for (int i = 0; i < soCanBo; i++) {
            System.out.println("\nNhap lua chon: ");
            System.out.println("\n1.cong nhan\n2.ky su\n3.nhan vien: ");
            int y = sc.nextInt();
            if (y < 0) {
                throw new Exception();
            }
            choose = y;
            CanBo a = new CanBo();
            switch (choose) {
                case 1:
                    a = new CongNhan();
                    break;
                case 2:
                    a = new KySu();
                    break;
                case 3:
                    a = new NhanVien();
                    break;
            }
            a.nhap();
            list.add(a);
        }
    }

    public static void inDS() {
        System.out.println("Danh sach cong nhan");
        CongNhan.inTieuDe();
        for (CanBo item : list) {
            if (item instanceof CongNhan) {
                item.xuat();
            }
        }
        System.out.println("Danh sach ky sy");
        KySu.inTieuDe();
        for (CanBo item : list) {
            if (item instanceof KySu) {
                item.xuat();
            }
        }
        System.out.println("Danh sach nhan vien");
        NhanVien.inTieuDe();
        for (CanBo item : list) {
            if (item instanceof NhanVien) {
                item.xuat();
            }
        }
    }

    static void findByName(String name) {
        CanBo x = null ;
        for (CanBo item : list) {
            if (item.equals(name)) {
                x= item;
                x.xuat();
            }
        }
        if(x == null){
            System.out.println("khong tim thay can bo nao");
        }
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            nhapds();
            inDS();
            System.out.println("---------------");
            System.out.println("nhap ten can tim");
            sc.nextLine();
            String name = sc.nextLine();

            findByName(name);

        } catch (Exception e) {
        }
    }

}
