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
public class HinhTron extends HinhPhang{
    public double bankinh;
     public void nhap(){
        System.out.println("Nhap ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextDouble();
    }
    @Override
    public double tinhCV(){
        return Math.PI*2*bankinh;
    }
    @Override
    public double tinhDT(){
        return Math.PI*Math.pow(bankinh, 2);
    }
}
