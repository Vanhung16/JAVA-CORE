/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitoanquanlytiendien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    static int soLuongKhachHang, loaiKhachHang;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<KhachHang> list = new ArrayList<>();

    static void nhapDanhSachKhachHang() {
        System.out.print("Nhap so luong khach hang: ");
        soLuongKhachHang = sc.nextInt();
        for (int i = 0; i < soLuongKhachHang; i++) {
            System.out.print("\nLua chon thong tin khach hang " + (i + 1));
            System.out.print("\n1. Khach hang Viet Nam");
            System.out.print("\n2. Khach hang Quoc Te");
            System.out.println("\n-------------------------------");
            loaiKhachHang = sc.nextInt();
            switch (loaiKhachHang) {
                case 1:
                    KHVietNam x = new KHVietNam();
                    x.nhapthongtin();
                    list.add(x);
                    break;
                case 2:
                    KHQuocTe y = new KHQuocTe();
                    y.nhapthongtin();
                    list.add(y);
                    break;
            }

        }
    }

    static void xuatDanhSach() {
        System.out.println("Danh sach khach hang Viet Nam la");
        KHVietNam.tieuDe();
        for (KhachHang item : list) {
            if (item instanceof KHVietNam) {
                item.xuattt();
            }
        }

        System.out.println("\nDanh sach khach hang Quoc Te la");
        KHQuocTe.tieuDe();
        for (KhachHang item : list) {
            if (item instanceof KHQuocTe) {
                item.xuattt();
            }
        }
    }

    static void tongSoLuongTieuThu() {
        int soLuongVietNam = 0, soLuongQuocTe = 0;
        for (KhachHang item : list) {
            if (item instanceof KHVietNam) {
                soLuongVietNam += ((KHVietNam) item).soLuong;
            }
        }

        for (KhachHang item : list) {
            if (item instanceof KHQuocTe) {
                soLuongQuocTe += ((KHQuocTe) item).soLuong;
            }
        }

        System.out.println("Tong So Luong Dien Nang Tieu Thu Khach Hang Viet Nam: " + soLuongVietNam);
        System.out.println("Tong So Luong Dien Nang Tieu Thu Khach Hang Viet Nam: " + soLuongQuocTe);

    }

    static void trungBinhTieuThuDien() {
        int tong = 0, count = 0;

        for (KhachHang item : list) {
            if (item instanceof KHQuocTe) {
                tong += ((KHQuocTe) item).soLuong;
                count++;
            }
        }
        System.out.println("trung binh tieu thu dien cua quoc te la: " + tong / count);
    }

    static void hienthihoadon() {
        System.out.println("hoa don thang 9 nam 2019 cua khach hang Viet Nam");
        KHVietNam.tieuDe();
        for (KhachHang item : list) {
            if (item instanceof KHVietNam) {
                if (item.thangTao() == 9 && item.namTao() == 2019) {
                    item.xuattt();
                }
            }
        }
        System.out.println("hoa don thang 9 nam 2019 cua khach hang Quoc Te");
        KHQuocTe.tieuDe();
        for (KhachHang item : list) {
            if (item instanceof KHQuocTe) {
                if (item.thangTao() == 9 && item.namTao() == 2019) {
                    item.xuattt();
                }
            }
        }
    }

    static void sapXepMaKhach() {
        System.out.println("Danh sach khach hang Viet Nam la");
        KHVietNam.tieuDe();
        Collections.sort(list, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o1.getMaKhachHang().compareTo(o2.getMaKhachHang());
            }

        });
        for (KhachHang item : list) {
            if (item instanceof KHVietNam) {
                item.xuattt();
            }
        }

        System.out.println("\nDanh sach khach hang Quoc Te la");
        KHQuocTe.tieuDe();
        for (KhachHang item : list) {
            if (item instanceof KHQuocTe) {
                item.xuattt();
            }
        }
    }

    static void findType() {
        System.out.println("Nhap loai can in(VN/QT): ");sc.nextLine();
        String name = sc.nextLine();
        if (name.toUpperCase().compareTo("VN") >0 || name.toUpperCase().compareTo("QT") > 0) {
            System.out.println("Loai ban tim ko ton tai");
        }else
        if (name.toUpperCase().compareTo("VN") ==0) {
            System.out.println("Danh sach khach hang Viet Nam la");
            KHVietNam.tieuDe();

            for (KhachHang item : list) {
                if (item instanceof KHVietNam) {
                    item.xuattt();
                }
            }
        }else
        if (name.toUpperCase().compareTo("QT") ==0) {
            System.out.println("\nDanh sach khach hang Quoc Te la");
            KHQuocTe.tieuDe();
            for (KhachHang item : list) {
                if (item instanceof KHQuocTe) {
                    item.xuattt();
                }
            }
        }
    }

    public static void main(String[] args) {
        nhapDanhSachKhachHang();
        xuatDanhSach();
//        tongSoLuongTieuThu();
//        trungBinhTieuThuDien();
//        hienthihoadon();
        System.out.println("---------------sort-------------------");
        sapXepMaKhach();
        System.out.println("---------------find Type Customer-------------------");
        findType();
    }
}
