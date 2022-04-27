/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de3_hinhphang;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class TamGiacCan extends HinhPhang {

    private int canh1, canh2, canh3;

    public TamGiacCan() {
    }

    public void setCanh1(int canh1) throws Exception {
        if (canh1 < 0) {
            throw new Exception();
        }
        this.canh1 = canh1;
    }

    public void setCanh2(int canh2) throws Exception {
        if (canh2 != this.canh1) {
            throw new Exception();
        }
        this.canh2 = canh2;
    }

    public void setCanh3(int canh3) throws Exception {
        if (this.canh1 + this.canh2 <= canh3) {
            throw new Exception();
        }
        this.canh3 = canh3;
    }

    public void nhap() {
        Random rand = new Random();
        while (true) {
            try {
                setCanh1(rand.nextInt(100) + 1);
                setCanh2(rand.nextInt(100) + 1);
                setCanh3(rand.nextInt(100) + 1);
                System.out.println("thanh cong");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void inTD(){
        System.out.printf("%10s %10s %10s %10s %10s%n","Canh 1", "Canh 2", "Canh 3", "Chu vi", "Dien tich");
    }
    public void xuat(){
        System.out.printf("%10d %10d %10d %10d %10.2f%n",canh1, canh2, canh3, tinhCV(), tinhDT());
    }

    @Override
    int tinhCV() {
        return canh1 + canh2 + canh3;
    }

    @Override
    float tinhDT() {
        float p = tinhCV() / 2;
        return (float) Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
    }

}
