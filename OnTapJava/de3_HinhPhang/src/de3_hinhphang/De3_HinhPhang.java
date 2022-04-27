/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de3_hinhphang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class De3_HinhPhang {

    /**
     * @param args the command line arguments
     */
    static int soHP;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<TamGiacCan> list = new ArrayList<TamGiacCan>();
    public static void nhap(){
        try {
            System.out.print("Nhap so hinh phang: ");
            int temp = sc.nextInt();
            if(temp <0) throw new Exception("so hinh phang ko dung");
            soHP = temp;
            for(int i = 0; i < soHP; i++){
                TamGiacCan x = new TamGiacCan();
                x.nhap();
                list.add(x);
            }
        } catch (Exception e) {
        }
    }
    public static void xuatds(){
        TamGiacCan.inTD();
        for (TamGiacCan tamGiacCan : list) {
            tamGiacCan.xuat();
            
        }
    }
    public static void findMaxS(){
        TamGiacCan x = Collections.max(list, new Comparator<TamGiacCan>(){
            @Override
            public int compare(TamGiacCan o1, TamGiacCan o2) {
               return (int) (o1.tinhDT()-o2.tinhDT());
            }
        });
        System.out.println("----------------------------");
        TamGiacCan.inTD();
        x.xuat();
    }
     public static void findMinS(){
        TamGiacCan x = Collections.min(list, new Comparator<TamGiacCan>(){
            @Override
            public int compare(TamGiacCan o1, TamGiacCan o2) {
               return (int) (o1.tinhDT()-o2.tinhDT());
            }
        });
        System.out.println("----------------------------");
        TamGiacCan.inTD();
        x.xuat();
    }
    public static void main(String[] args) {
        nhap();
        xuatds();
        findMaxS();
        findMinS();
    }
    
}
