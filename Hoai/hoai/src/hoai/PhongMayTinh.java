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

public class PhongMayTinh extends PhongHoc {

    private int soMayTinh;

    public PhongMayTinh() {

    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.print("Nhap so may tinh:");
        this.soMayTinh = sc.nextInt();
    }

    public void Output() {
        super.Output();
        System.out.printf("%20d\n", this.soMayTinh);
    }

    public PhongMayTinh(int maPhong, int dayNha, long dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public boolean IsDatChuan() {
        if (this.dienTich / 1.5 <= this.soMayTinh && this.dienTich / 10 <= this.soBongDen) {
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

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return this.soMayTinh;
    }
}
