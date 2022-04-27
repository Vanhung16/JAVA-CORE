 public static void inToanBoDanhSach() {
        System.out.println("\nIn toan bo danh sach cac phong hoc -------------");
        for (PhongHoc phongHoc : list) {
            System.out.println(phongHoc.toString());
        }
    }

    public static void inPhongDatChuan() {
        System.out.println("\nIn danh sach cac phong hoc dat chuan -------------");
        for (PhongHoc phongHoc : list) {
            if (phongHoc.dienTich >= 10 && phongHoc.soBongDen >= 1) {
                if (phongHoc.checkStandard()) {
                    System.out.println(phongHoc.toString());
                }
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

        for (PhongHoc phongHoc : list) {

            if (phongHoc instanceof PhongMayTinh) {
                PhongMayTinh x = new PhongMayTinh();
                x = (PhongMayTinh) phongHoc;
                listMT.add(x);
            }

        }
        for (PhongMayTinh phongMayTinh : listMT) {
            if (phongMayTinh.soMayTinh >= 60) {
                System.out.println(phongMayTinh.toString());
            }
        }
    }