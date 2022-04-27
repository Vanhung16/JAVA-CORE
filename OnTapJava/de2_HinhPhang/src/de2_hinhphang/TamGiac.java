package de2_hinhphang;

import java.util.Random;

public class TamGiac implements HinhPhang {

    private int canh1, canh2, canh3;

    public TamGiac() {
    }

    public void setCanh1(int canh1) throws Exception {
        if (canh1 < 0 ) {
            throw new Exception("Canh <0");
        }
        this.canh1 = canh1;
    }

    public void setCanh2(int canh2) throws Exception {
        if (canh2 < 0 ) {
            throw new Exception("Canh <0");
        }

        this.canh2 = canh2;
    }

    public void setCanh3(int canh3) throws Exception {
        if (canh3 >= this.canh1+this.canh2|| this.canh2 >= this.canh1+canh3 || this.canh1 >= this.canh2+canh3 ) {
            throw new Exception("sai");
        }
        this.canh3 = canh3;
    }

    public void nhap()  {
        Random rand = new Random();
        while (true) {
            try {
                setCanh1(rand.nextInt(100) + 1);
                setCanh2(rand.nextInt(100) + 1);
                setCanh3(rand.nextInt(100) + 1);
                System.out.println("Thanh cong");
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void inTieuDe() {
        System.out.printf("%10s %10s %10s %10s %10s%n", "canh 1", "canh 2", "canh 3", "Chu vi", "Dien tich");
    }

    public void xuat() {
        System.out.printf("%10d %10d %10d %10d %10.2f%n", canh1, canh2, canh3, tinhCV(), tinhDT());
    }

    @Override
    public int tinhCV() {
        return canh1 + canh2 + canh3;
    }

    @Override
    public float tinhDT() {
        float p = tinhCV() / 2;
        return (float) Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
    }

}
