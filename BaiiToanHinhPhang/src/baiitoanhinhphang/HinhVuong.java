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
public class HinhVuong extends HinhPhang{
    public double canh;
    public void nhap(){
        System.out.println("Nhap canh cua hinh vuong: ");
        Scanner sc = new Scanner(System.in);
        canh = sc.nextDouble();
    }
       @Override
 public double tinhCV(){
     return (canh + canh)*2;
 }  
 @Override
 public double tinhDT(){
     return canh * canh;
 }  
}
