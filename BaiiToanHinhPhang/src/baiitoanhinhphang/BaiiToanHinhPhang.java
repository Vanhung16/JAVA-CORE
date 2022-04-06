/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baiitoanhinhphang;

/**
 *
 * @author Admin
 */
public class BaiiToanHinhPhang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HinhVuong a = new HinhVuong();
        HinhTron b = new HinhTron();
        HinhChuNhat c = new HinhChuNhat();
        a.nhap();
        b.nhap();
        c.nhap();
        System.out.println("----------------------------");
        System.out.println("Chu vi hinh vuong canh "+ a.canh+" la: "+a.tinhCV());
        System.out.println("Dien tich hinh vuong canh "+ a.canh+" la: "+a.tinhDT());
        System.out.println("----------------------------");
        System.out.println("Chu vi hinh tron ban kinh"+ b.bankinh+" la: "+b.tinhCV());
        System.out.println("Dien tich hinh tron banh kinh "+ b.bankinh+" la: "+b.tinhDT());
        System.out.println("----------------------------");
        System.out.println("Chu vi hinh chu nhat canh dai "+ c.chieudai+" va chieu rong "+c.chieurong+ " la: "+c.tinhCV());
        System.out.println("Dien tich hinh chu nhat canh dai "+ c.chieudai+" va chieu rong "+c.chieurong+ " la: "+c.tinhDT());


        
    }
    
}
