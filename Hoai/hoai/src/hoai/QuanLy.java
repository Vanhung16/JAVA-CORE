/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoai;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLy {

    public static void main(String[] args) {
        ArrayList<PhongMayTinh> listPhongMayTinh = new ArrayList<PhongMayTinh>();
        ArrayList<PhongThiNghiem> listPhongThiNghiem = new ArrayList<PhongThiNghiem>();
        ArrayList<PhongLyThuyet> listPhongLyThuyet = new ArrayList<PhongLyThuyet>();
        ArrayList<Integer> listMaPhong = new ArrayList<Integer>();
        listMaPhong.add(1);
        listMaPhong.add(2);
        listMaPhong.add(3);
        boolean isStart = true;
        PhongLyThuyet lyThuyet1 = new PhongLyThuyet(1, 1, 20, 10, true);
        listPhongLyThuyet.add(lyThuyet1);
        PhongMayTinh mayTinh1 = new PhongMayTinh(2, 1, 20, 10, 15);
        listPhongMayTinh.add(mayTinh1);
        PhongThiNghiem thiNghiem1 = new PhongThiNghiem(3, 1, 20, 10, "cntt", 20, true);
        listPhongThiNghiem.add(thiNghiem1);
        Scanner sc = new Scanner(System.in);
        int select;
        while (isStart) {
            System.out.println("\n===============================");
            System.out.println("\t\tChon thao tac");
            System.out.println("1. Them phong hoc.");
            System.out.println("2. Tim kiem phong theo ma phong.");
            System.out.println("3. In toan bo danh sach phong.");
            System.out.println("4. In danh sach cac phong dat chuan.");
            System.out.println("5. Sap xep phong theo chieu tang dan cua day nha.");
            System.out.println("6. Sap xep phong theo chieu giam dan cua dien tich.");
            System.out.println("7. Sap xep phong theo chieu tang dan cua so bong den.");
            System.out.println("8. Cap nhat so may tinh cho mot phong may tinh.");
            System.out.println("9. Xoa phong hoc theo ma phong.");
            System.out.println("10. In ra tong so phong hoc");
            System.out.println("11. In danh sach cac phong may co 60 m�y");
            System.out.println("12. Ket thuc.");
            System.out.println("\n===============================");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    int selectRoom;
                    System.out.println("\t\tChon loai phong:");
                    System.out.println("1. Phong may tinh");
                    System.out.println("2. Phong thi nghiem");
                    System.out.println("3. Phong ly thuyet");
                    selectRoom = sc.nextInt();
                    if (selectRoom == 1) {
                        PhongMayTinh aMayTinh = new PhongMayTinh();
                        aMayTinh.Input();
                        while (listMaPhong.contains(aMayTinh.maPhong)) {
                            System.out.println("Ma phong bi trung, yeu cau nhap lai.");
                            aMayTinh.Input();
                        }
                        listPhongMayTinh.add(aMayTinh);
                        listMaPhong.add(aMayTinh.maPhong);
                    } else if (selectRoom == 2) {
                        PhongThiNghiem aThiNghiem = new PhongThiNghiem();
                        aThiNghiem.Input();
                        while (listMaPhong.contains(aThiNghiem.maPhong)) {
                            System.out.println("Ma phong bi trung, yeu cau nhap lai.");
                            aThiNghiem.Input();
                        }
                        listPhongThiNghiem.add(aThiNghiem);
                        listMaPhong.add(aThiNghiem.maPhong);
                    } else if (selectRoom == 3) {
                        PhongLyThuyet aLyThuyet = new PhongLyThuyet();
                        aLyThuyet.Input();
                        while (listMaPhong.contains(aLyThuyet.maPhong)) {
                            System.out.println("Ma phong bi trung, yeu cau nhap lai.");
                            aLyThuyet.Input();
                        }
                        listPhongLyThuyet.add(aLyThuyet);
                        listMaPhong.add(aLyThuyet.maPhong);
                    } else {
                        System.out.println("lua chon khong hop le.");
                    }
                    break;
                case 2:
                    int maPhongSelect;
                    System.out.print("Nhap ma phong can tim:");
                    maPhongSelect = sc.nextInt();
                    System.out.println("\n\t\tPhong can tim la");
                    for (PhongLyThuyet aLyThuyet : listPhongLyThuyet) {
                        if (aLyThuyet.maPhong == maPhongSelect) {
                            System.out.printf("%20s%20s%20s%20s%20s\n", "Ma phong", "Day nha", "Dien tich", "So bong den", "May chieu");
                            aLyThuyet.Output();
                        }
                    }
                    for (PhongMayTinh aMayTinh : listPhongMayTinh) {
                        if (aMayTinh.maPhong == maPhongSelect) {
                            System.out.printf("%20s%20s%20s%20s%20s\n", "Ma phong", "Day nha", "Dien tich", "So bong den", "So may tinh");
                            aMayTinh.Output();
                        }
                    }
                    for (PhongThiNghiem aThiNghiem : listPhongThiNghiem) {
                        if (aThiNghiem.maPhong == maPhongSelect) {
                            System.out.printf("%20s%20s%20s%20s%20s%20s%20s\n", "Ma phong", "Day nha", "Dien tich", "So bong den", "Chuyen nganh", "Suc chua", "May chieu");
                            aThiNghiem.Output();
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n\n\t\t\tDanh sach phong ly thuyet");
                    System.out.printf("%20s%20s%20s%20s%20s\n", "Ma phong", "Day nha", "Dien tich", "So bong den", "May chieu");
                    for (PhongLyThuyet a : listPhongLyThuyet) {
                        a.Output();
                    }
                    System.out.println("\n\n\t\t\tDanh sach phong may tinh");
                    System.out.printf("%20s%20s%20s%20s%20s\n", "Ma phong", "Day nha", "Dien tich", "So bong den", "So may tinh");
                    for (PhongMayTinh a : listPhongMayTinh) {
                        a.Output();
                    }
                    System.out.println("\n\n\t\t\tDanh sach phong thi nghiem");
                    System.out.printf("%20s%20s%20s%20s%20s%20s%20s\n", "Ma phong", "Day nha", "Dien tich", "So bong den", "Chuyen nganh", "Suc chua", "May chieu");
                    for (PhongThiNghiem a : listPhongThiNghiem) {
                        a.Output();
                    }
                    break;
                case 4:
                    System.out.println("\n\n\t\t\tDanh sach phong ly thuyet dat chuan");
                    System.out.printf("%20s%20s%20s%20s%20s\n", "Ma phong", "Day nha", "Dien tich", "So bong den", "May chieu");
                    for (PhongLyThuyet a : listPhongLyThuyet) {
                        if (a.IsDatChuan()) {
                            a.Output();
                        }
                    }
                    System.out.println("\n\n\t\t\tDanh sach phong may tinh dat chuan");
                    System.out.printf("%20s%20s%20s%20s%20s\n", "Ma phong", "Day nha", "Dien tich", "So bong den", "So may tinh");
                    for (PhongMayTinh a : listPhongMayTinh) {
                        if (a.IsDatChuan()) {
                            a.Output();
                        }
                    }
                    System.out.println("\n\n\t\t\tDanh sach phong thi nghiem dat chuan");
                    System.out.printf("%20s%20s%20s%20s%20s%20s%20s\n", "Ma phong", "Day nha", "Dien tich", "So bong den", "Chuyen nganh", "Suc chua", "May chieu");
                    for (PhongThiNghiem a : listPhongThiNghiem) {
                        if (a.IsDatChuan()) {
                            a.Output();
                        }
                    }
                    break;
                case 5:
                    Collections.sort(listPhongMayTinh, Comparator.comparing(PhongMayTinh::getDayNha));
                    Collections.sort(listPhongLyThuyet, Comparator.comparing(PhongLyThuyet::getDayNha));
                    Collections.sort(listPhongThiNghiem, Comparator.comparing(PhongThiNghiem::getDayNha));
                    System.out.println("\nSap xep theo day nha thanh cong");
                    break;
                case 6:
                    Collections.sort(listPhongMayTinh, Comparator.comparing(PhongMayTinh::getDienTich));
                    Collections.reverse(listPhongMayTinh);
                    Collections.sort(listPhongLyThuyet, Comparator.comparing(PhongLyThuyet::getDienTich));
                    Collections.reverse(listPhongLyThuyet);
                    Collections.sort(listPhongThiNghiem, Comparator.comparing(PhongThiNghiem::getDienTich));
                    Collections.reverse(listPhongThiNghiem);
                    System.out.println("\nSap xep theo dien tich thanh cong");
                    break;
                case 7:
                    Collections.sort(listPhongMayTinh, Comparator.comparing(PhongMayTinh::getSoBongDen));
                    Collections.sort(listPhongLyThuyet, Comparator.comparing(PhongLyThuyet::getSoBongDen));
                    Collections.sort(listPhongThiNghiem, Comparator.comparing(PhongThiNghiem::getSoBongDen));
                    System.out.println("\nSap xep theo so bong den thanh cong");
                    break;
                case 8:
                    int maPhongUpdate;
                    Integer soMayTinh;
                    System.out.print("Nhap ma phong may tinh can cap nhat:");
                    maPhongUpdate = sc.nextInt();
                    System.out.print("Nhap so may tinh muon cap nhat:");
                    soMayTinh = sc.nextInt();
                    for (PhongMayTinh a : listPhongMayTinh) {
                        if (a.maPhong == maPhongUpdate) {
                            a.setSoMayTinh(soMayTinh);
                        }
                    }
                    System.out.println("Cap nhat thanh cong.");
                    break;
                case 9:
                    int maPhongDelete;
                    int confirm;
                    System.out.print("Nhap ma phong muon xoa:");
                    maPhongDelete = sc.nextInt();
                    System.out.print("Ban c� chac chan muon xoa khong. Nhap 1 de xoa, nhap 0 de huy:");
                    confirm = sc.nextInt();
                    int countLT = 0;
                    int countMT = 0;
                    int countTN = 0;
                    if (confirm == 1) {
                        for (PhongLyThuyet a : listPhongLyThuyet) {
                            if (a.maPhong == maPhongDelete) {
                                listPhongLyThuyet.remove(countLT);
                                break;
                            }
                            countLT++;
                        }
                        for (PhongMayTinh a : listPhongMayTinh) {
                            if (a.maPhong == maPhongDelete) {
                                listPhongMayTinh.remove(countMT);
                                break;
                            }
                            countMT++;
                        }
                        for (PhongThiNghiem a : listPhongThiNghiem) {
                            if (a.maPhong == maPhongDelete) {
                                listPhongThiNghiem.remove(countTN);
                                break;
                            }
                            countTN++;
                        }
                    } else {
                        break;
                    }
                    break;
                case 10:
                    int sum = 0;
                    sum += listPhongLyThuyet.size();
                    sum += listPhongMayTinh.size();
                    sum += listPhongThiNghiem.size();
                    System.out.println("Tong so phong hoc la: " + sum);
                    break;
                case 11:
                    System.out.println("\n\t\t\tDanh sach phong may tinh co 60 may tinh la");
                    System.out.printf("%20s%20s%20s%20s%20s\n", "Ma phong", "Day nha", "Dien tich", "So bong den", "So may tinh");
                    for (PhongMayTinh a : listPhongMayTinh) {
                        if (a.getSoMayTinh() == 60) {
                            a.Output();
                        }
                    }
                    break;
                case 12:
                    isStart = false;
                    break;
            }
        }
    }
}
