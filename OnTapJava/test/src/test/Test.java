/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author HP
 */
public class Test {

    static Set<HinhVuong> list = new LinkedHashSet<>();
    static int soPhantu;
    static Scanner sc = new Scanner(System.in);

    public static void nhapds() {
        System.out.println("Nhap so phan tu: ");
        try {
            int temp = sc.nextInt();
            if(temp < 0 || temp > 10) throw new Exception("so hinh vuong (1,10)");
            soPhantu = temp;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < soPhantu; i++) {
            HinhVuong x = new HinhVuong();
            x.nhapDL();
            list.add(x);
        }
    }
    
    public static void inds(){
        HinhVuong.inTD();
        Iterator<HinhVuong> i = list.iterator();
        while(i.hasNext()){
            HinhVuong x = i.next();
            x.output();
//            System.out.println(i.next());
        }
    }
    
//    public static void updateHinhVuong(){
//        string 
//    }

    public static void main(String[] args) {
        nhapds();
        System.out.println("_____________________");
        inds();
    }

}
