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

public class PhongLyThuyet extends PhongHoc {

    private boolean isMayChieu;

    public PhongLyThuyet() {

    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        int i;
        super.Input();
        System.out.print("Co may chieu khong. Nhap 1 neu co, 0 neu Khong co:");
        i = sc.nextInt();
        if (i == 1) {
            this.isMayChieu = true;
        } else {
            this.isMayChieu = false;
        }
    }

    public void Output() {
        super.Output();
        String str = Boolean.toString(this.isMayChieu);
        System.out.printf("%20s\n", str);
    }

    public PhongLyThuyet(int maPhong, int dayNha, long dienTich, int soBongDen, boolean isMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.isMayChieu = isMayChieu;
    }

    public boolean IsDatChuan() {
        if (this.isMayChieu == true && this.dienTich / 10 <= this.soBongDen) {
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
