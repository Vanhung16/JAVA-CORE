/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1_hinhphang;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HinhCN extends HinhPhang {

    private int chieudai;
    private int chieurong;
    private String mahinh;

    public int getChieudai() {
        return chieudai;
    }

    public void setChieudai(int chieudai) throws Exception {
        if (chieudai < 0 || chieudai < this.chieurong) {
            throw new Exception("Chieu dai sai");
        }
        this.chieudai = chieudai;
    }

    public int getChieurong() {
        return chieurong;
    }

    public void setChieurong(int chieurong) throws Exception {
        if (chieurong < 0 || chieurong > this.chieudai) {
            throw new Exception("chieu rong sai");
        }
        this.chieurong = chieurong;
    }

    public String getMahinh() {
        return mahinh;
    }

    public void setMahinh(String mahinh) {
        this.mahinh = mahinh;
    }

    public HinhCN(int chieudai, int chieurong, String mahinh) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
        this.mahinh = mahinh;
    }

    public HinhCN() {
    }

    public void nhap()  {

        while (true) {
            //        Scanner sc = new Scanner(System.in);
            try {
                 Random rand = new Random();
            int ma = rand.nextInt(20) + 1;
            if(ma < 10){
                setMahinh("CN 0" + ma);
            }else{
                setMahinh("CN " + ma);
            }
//        System.out.print("Nhap chieu dai: ");
            setChieudai(rand.nextInt(100) + 1);
//        System.out.print("Nhap chieu rong: ");
            setChieurong(rand.nextInt(100) + 1);
            break;
            } catch (Exception e) {
            }
        }

    }

    public static void inTieuDe() {
        System.out.printf("%10s %10s %10s %10s %10s%n", "ma hinh", "chieu dai", "chieu rong", "chu vi", "dien tich");
    }

    @Override
    public void xuat() {
        System.out.printf("%10s %10s %10s %10s %10s%n", mahinh, chieudai, chieurong, tinhCV(), tinhDT());

    }

    @Override
    int tinhCV() {
        return (chieudai + chieurong) * 2;
    }

    @Override
    int tinhDT() {
        return chieudai * chieurong;
    }

    @Override
    public String toString() {
        return "HinhCN{" + "chieudai=" + chieudai + ", chieurong=" + chieurong + ", mahinh=" + mahinh + '}';
    }

    @Override
    public boolean equals(Object obj) {

        final HinhCN other = (HinhCN) obj;

        if (!Objects.equals(this.mahinh, other.mahinh)) {
            return false;
        }
        return true;
    }

}
