/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ThiSinhA extends ThiSinh{
    private float Toan;
    private float Ly;
    private float Hoa;

    public ThiSinhA() {
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem toan:");
        Toan = sc.nextFloat();
        System.out.print("Nhap diem ly:");
        Ly = sc.nextFloat();
        System.out.print("Nhap diem hoa:");
        Hoa = sc.nextFloat();
    }
    public static void inTieuDe(){
        
    }
}
