
package bai4_phieu5_nguyenvanhung;

import java.util.Scanner;


public class KhachHang {
   private String hoten, diachi;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();
    }
   
    
    @Override
    public String toString() {
        return "KhachHang{" + "hoten=" + hoten + ", diachi=" + diachi + '}';
    }
   
}
