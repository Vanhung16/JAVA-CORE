/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoai;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class PhongThiNghiem extends PhongHoc {

    private String chuyenNganh;
    private int sucChua;
    private boolean isBonRua;

    public PhongThiNghiem() {

    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        int i;
        super.Input();
        System.out.print("Nhap chuyen nganh:");
        this.chuyenNganh = sc.nextLine();
        System.out.print("Nhap suc chua:");
        this.sucChua = sc.nextInt();
        System.out.print("Co bon rua hay khong. Nhap 1 neu co, nhap 0 neu khong:");
        i = sc.nextInt();
        if (i == 1) {
            this.isBonRua = true;
        } else {
            this.isBonRua = false;
        }
    }

    public void Output() {
        super.Output();
        String str = Boolean.toString(this.isBonRua);
        System.out.printf("%20s%20d%20s\n", this.chuyenNganh, this.sucChua, str);
    }

    public PhongThiNghiem(int maPhong, int dayNha, long dienTich, int soBongDen, String chuyenNganh, int sucChua, boolean isBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.isBonRua = isBonRua;
    }

    public boolean IsDatChuan() {
        if (this.isBonRua == true && this.dienTich / 10 <= this.soBongDen) {
            return true;
        } else {
            return false;
        }
    }

    public int getDayNha() {
        return this.dayNha;
    }

    public long getDienTich() {
        return this.dienTich;
    }

    public int getSoBongDen() {
        return this.soBongDen;
    }
}
