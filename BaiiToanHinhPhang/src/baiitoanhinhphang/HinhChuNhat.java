/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiitoanhinhphang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HinhChuNhat extends HinhPhang{
    public double chieudai;
    public double chieurong;
     public void nhap(){
        System.out.println("Nhap chieu dai cua hinh chu nhat: ");
        Scanner sc = new Scanner(System.in);
        chieudai = sc.nextDouble();
        System.out.println("Nhap chieu rong cua hinh chu nhat: ");
        chieurong = sc.nextDouble();
    }
    @Override
 public double tinhCV(){
     return (chieudai + chieurong)*2;
 }  
 @Override
 public double tinhDT(){
     return chieudai * chieurong;
 }   
}
