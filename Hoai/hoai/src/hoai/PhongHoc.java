/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoai;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhongHoc {

    protected int maPhong;
    protected int dayNha;
    protected long dienTich;
    protected int soBongDen;

    public PhongHoc(int maPhong, int dayNha, long dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public PhongHoc() {

    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma phong:");
        this.maPhong = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap day nha:");
        this.dayNha = sc.nextInt();
        System.out.print("Nhap dien tich:");
        this.dienTich = sc.nextLong();
        System.out.print("Nhap so bong den:");
        this.soBongDen = sc.nextInt();
    }

    public void Output() {
        System.out.printf("%20d%20d%20d%20d", this.maPhong, this.dayNha, this.dienTich, this.soBongDen);
    }
}
