package bai2;

import java.util.Scanner;

public class SinhVien {

    private String maSV;
    private String hoTen;
    private float diemLyThuyet;
    private float diemThucHanh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, float diemLyThuyet, float diemThucHanh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(float diemLyThuyet) {
        this.diemLyThuyet = diemLyThuyet;
    }

    public float getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(float diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }

    public void nhap() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem ly thuyet: ");
        float diemlt = sc.nextFloat();
        if (diemlt < 0) {
            throw new Exception("diem > 0");
        }
        diemLyThuyet = diemlt;
        System.out.print("Nhap diem thuc hanh: ");
        float diemth = sc.nextFloat();
        if (diemth < 0) {
            throw new Exception("diem > 0");
        }
        diemThucHanh = diemth;
    }

    public float trungbinh() {
        return (diemLyThuyet + diemThucHanh) / 2;
    }

    public String kq() {
        if (trungbinh() >= 5) {
            return "Dau";
        }
        return "Rot";
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", diemLyThuyet=" + diemLyThuyet +
                ", diemThucHanh=" + diemThucHanh + ", diem trung binh=" + trungbinh() + ", kQ=" + kq() + '}';   
    }

}
