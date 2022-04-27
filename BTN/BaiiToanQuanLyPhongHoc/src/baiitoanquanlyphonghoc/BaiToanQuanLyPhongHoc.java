package baiitoanquanlyphonghoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BaiToanQuanLyPhongHoc {

    static ArrayList<PhongHoc> list = new ArrayList<PhongHoc>();
    static ArrayList<PhongHocLyThuyet> listLT = new ArrayList<>();
    static ArrayList<PhongMayTinh> listMT = new ArrayList<>();
    static ArrayList<PhongThiNghiem> listTN = new ArrayList<>();

    static int choose;
    static Scanner sc = new Scanner(System.in);

    static Boolean checkMP(String mp) {
        for (PhongHoc phongHoc : list) {
            if (phongHoc.getMaPhong().compareTo(mp) == 0) {
                return true;
            }
        }
        return false;
    }

    public static void findByMaPhong() {
        System.out.print("---->Nhap ma phong can tim: ");
        sc.nextLine();
        String mp = sc.nextLine();
        PhongHoc x = null;

        for (PhongHoc phongHoc : list) {
            if (phongHoc.getMaPhong().compareTo(mp) == 0) {
                x = phongHoc;
            }
        }
        if (x != null) {
            System.out.println(x.toString());
        } else {
            System.out.println("---->khong co ma phong trong list");
        }
    }

    public static void themMoi() throws Exception {
        int luachon;

        while (true) {
            try {
                System.out.println("Nhap lua chon loai phong can nhap:");
                System.out.println("1.Phong Ly thuyet");
                System.out.println("2.Phong Thuc hanh");
                System.out.println("3.Phong May tinh");
                System.out.print("\nLua chon: ");
                int temp = sc.nextInt();
                if (temp < 0 || temp > 3) {
                    throw new Exception("---->ngoai vung chon");
                }
                luachon = temp;
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        switch (luachon) {
            case 1:
                while (true) {
                    PhongHocLyThuyet x = new PhongHocLyThuyet();
                    x.nhap();
                    if (!checkMP(x.maPhong)) {
                        list.add(x);
                        break;
                    }
                    System.out.println("---->Ma phong da ton tai!");
                }
                break;
            case 2:
                while (true) {
                    PhongThiNghiem x = new PhongThiNghiem();
                    x.nhap();
                    if (!checkMP(x.maPhong)) {
                        list.add(x);
                        break;
                    }
                    System.out.println("---->Ma phong da ton tai!");
                }
                break;
            case 3:
                while (true) {
                    PhongMayTinh x = new PhongMayTinh();
                    x.nhap();
                    if (!checkMP(x.maPhong)) {
                        list.add(x);
                        break;
                    }
                    System.out.println("---->Ma phong da ton tai!");
                }
                break;
        }

    }

//    ------------------------------------Manh Hieu+Khoi
    public static void inToanBoDanhSach() {
        System.out.println("\nIn toan bo danh sach cac phong hoc ");
        for (PhongHoc phongHoc : list) {
            if (phongHoc instanceof PhongHocLyThuyet) {
                listLT.add((PhongHocLyThuyet) phongHoc);
            } else if (phongHoc instanceof PhongMayTinh) {
                listMT.add((PhongMayTinh) phongHoc);
            } else if (phongHoc instanceof PhongThiNghiem) {
                listTN.add((PhongThiNghiem) phongHoc);
            }
        }
        System.out.println("\n--------------------------");
        System.out.println("Danh sach phong ly thuyet");
        if (listLT.isEmpty()) {
            System.out.println("Khong co phong ly thuyet nao");
        } else {
            for (PhongHocLyThuyet phongHocLyThuyet : listLT) {
                System.out.println(phongHocLyThuyet.toString());
            }
        }
        System.out.println("\n--------------------------");
        System.out.println("Danh sach phong may tinh");

        if (listMT.isEmpty()) {
            System.out.println("Khong co phong may tinh nao");
        } else {
            for (PhongMayTinh phongMayTinh : listMT) {
                System.out.println(phongMayTinh.toString());
            }
        }
        System.out.println("\n--------------------------");
        System.out.println("Danh sach phong thi nghiem");

        if (listTN.isEmpty()) {
            System.out.println("Khong co phong thi nghiem nao");
        } else {
            for (PhongThiNghiem phongThiNghiem : listTN) {
                System.out.println(phongThiNghiem.toString());
            }
        }
    }

    public static void inPhongDatChuan() {
        System.out.println("\nIn danh sach cac phong hoc dat chuan");
        System.out.println("\n--------------------------");
        System.out.println("Danh sach phong hoc ly thuyet dat chuan");
        for (PhongHocLyThuyet phongHocLyThuyet : listLT) {
            if (phongHocLyThuyet.checkStandard()) {
                System.out.println(phongHocLyThuyet.toString());
            }
        }
        System.out.println("\n--------------------------");
        System.out.println("Danh sach phong hoc may tinh dat chuan");
        for (PhongMayTinh phongMayTinh : listMT) {
            if (phongMayTinh.checkStandard()) {
                System.out.println(phongMayTinh.toString());
            }
        }
        System.out.println("\n--------------------------");
        System.out.println("Danh sach phong hoc thi nghiem dat chuan");
        for (PhongThiNghiem phongThiNghiem : listTN) {
            if (phongThiNghiem.checkStandard()) {
                System.out.println(phongThiNghiem.toString());
            }
        }
    }

    public static void inTongSoPhong() {
        System.out.println("\nIn ra tong so phong hoc -------------");
        int number = 0;
        for (PhongHoc phongHoc : list) {
            number++;
        }
        System.out.println("Tong so luong cac phong hoc la :" + number);

    }

    public static void inPhong60May() {

        System.out.println("\nIn danh sach cac phong may co 60 may tinh -------------");

        ArrayList<PhongMayTinh> listMt = new ArrayList<PhongMayTinh>();
        for (PhongHoc phongHoc : list) {

            if (phongHoc instanceof PhongMayTinh) {
                PhongMayTinh x = new PhongMayTinh();
                x = (PhongMayTinh) phongHoc;
                listMt.add(x);
            }

        }
        for (PhongMayTinh phongMayTinh : listMt) {
            if (phongMayTinh.getSoMayTinh() >= 60) {
                System.out.println(phongMayTinh.toString());
            }
        }
    }
//    -----------------------------------Hoang

    public static void SXTangDanTheoCotDayNha() {
        Collections.sort(list, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return o1.getDayNha().compareTo(o2.getDayNha());
            }
        });
        inToanBoDanhSach();

    }

    public static void SXGiamDanTheoDienTich() {
        Collections.sort(list, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return (int) (o2.getDienTich() - o1.getDienTich());
            }

        });

        inToanBoDanhSach();
    }

    public static void SXTangDanTheoBongDen() {
        Collections.sort(list, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return (int) (o1.getSoBongDen() - o2.getSoBongDen());
            }

        });

        inToanBoDanhSach();
    }
//------------------------------Cuong

    public static void UpdateCountPC() {
        System.out.print("---->Nhap ma phong can cap nhat: ");
        sc.nextLine();
        String mp = sc.nextLine();
        int index = 0;
        for (PhongHoc phonghoc : list) {
            if (phonghoc.getMaPhong().compareTo(mp) == 0) {
                index = list.indexOf(phonghoc);
                break;
            }
        }
        System.out.println("\t\t\nDanh sach ban dau");
        inToanBoDanhSach();

        PhongMayTinh temp = new PhongMayTinh();
        if (list.get(index) instanceof PhongMayTinh) {
            temp = (PhongMayTinh) list.get(index);
        }
        while (true) {
            try {
                System.out.print("Nhap so may tinh cua phong: ");
                int somaytinh = sc.nextInt();
                temp.setSoMayTinh(somaytinh);
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        list.set(index, temp);
        System.out.println("\t\t\nSau khi cap nhat");
        inToanBoDanhSach();
    }

    public static void Remove_By_MP() {
        System.out.print("---->Nhap ma phong can xoa: ");
        sc.nextLine();
        String mp = sc.nextLine();
        int index = -1;
        for (PhongHoc phonghoc : list) {
            if (phonghoc.getMaPhong().compareTo(mp) == 0) {
                index = list.indexOf(phonghoc);
                break;
            }
        } 
        if (index == -1) {
            System.out.println("ma phong can xoa khong ton tai!");
        } else {
            System.out.print("ban co chac chan muon xoa(y/n): ");
            String ans = sc.nextLine();
            switch (ans) {
                case "y":
                    list.remove(index);
                    System.out.println("\t\t\nSau xoa");
                    for (PhongHoc phonghoc : list) {
                        System.out.println(phonghoc.toString());
                    }
                    break;
                case "n": return;
            }
        }

    }

    public static void main(String[] args) {
        list.add(new PhongHocLyThuyet(1, "404", "A9", 45.0f, 7));
        list.add(new PhongThiNghiem("Hoa", 45, 2, "705", "A1", 70.0f, 5));
        list.add(new PhongMayTinh(100, "704", "A1", 65.0f, 70));
        while (true) {

            System.out.println("Lua chon chuc nang");
            System.out.println("1.Them mot phong hoc");
            System.out.println("2. Tìm kiếm phòng học");
            System.out.println("3. In toan bo danh sach cac phong hoc");
            System.out.println("4. In danh sach cac phong hoc dat chuan");
            System.out.println("5. In tong so phong hoc");
            System.out.println("6. In danh sach cac phong may co so may hon 60");
            System.out.println("7. Sap xep tang dan theo day nha");
            System.out.println("8. Sap xep giam dan theo dien tich");
            System.out.println("9. Sap xep tang dan theo bong den");
            System.out.println("10. Cap nhat mot phong may tinh");
            System.out.println("11. xoa mot phong hoc");
            System.out.println("12. Thoat");

            System.out.print("Nhap lua chon: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                try {
                    themMoi();
                } catch (Exception e) {
                }
                break;
                case 2:
                    findByMaPhong();
                    break;
                case 3:
                    inToanBoDanhSach();
                    break;
                case 4:
                    inPhongDatChuan();
                    break;
                case 5:
                    inTongSoPhong();
                    break;
                case 6:
                    inPhong60May();
                    break;
                case 7:
                    SXTangDanTheoCotDayNha();
                    break;
                case 8:
                    SXGiamDanTheoDienTich();
                    break;
                case 9:
                    SXTangDanTheoBongDen();
                    break;
                case 10:
                    UpdateCountPC();
                    break;
                case 11:
                    Remove_By_MP();
                    break;
                case 12:
                    System.out.println("__________BYE___________");
                    return;
                default:
                    return;
            }
        }

    }

}
