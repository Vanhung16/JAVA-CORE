/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap_linkedhashset;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HinhTron {

    private float bankinh;
    private String mahinh;

    public float getBankinh() {
        return bankinh;
    }

    public void setBankinh(float bankinh) throws Exception {
        if (bankinh < 0) {
            throw new Exception("Ban kinh nho hon 0, Nhap lai!");
        }
        this.bankinh = bankinh;
    }

    public String getMahinh() {
        return mahinh;
    }

    public void setMahinh(String mahinh) {
        this.mahinh = mahinh;
    }

    public void nhap() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            try {
                setMahinh("HT-" + rand.nextInt(10) + 10);
                System.out.print("Nhap ban kinh: ");
                setBankinh(sc.nextFloat());
                break;
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void inTD() {
        System.out.printf("%-10s %10s%n ", "MA HINH", "BAN KINH");
    }

    public void xuat() {
        System.out.printf("%-10s %10.1f%n ", getMahinh(), getBankinh());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HinhTron other = (HinhTron) obj;

        if (!Objects.equals(this.mahinh, other.mahinh)) {
            return false;
        }
        return true;
    }

}
