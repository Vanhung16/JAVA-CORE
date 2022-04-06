package com.mycompany.bai1;

import java.util.Scanner;

public class Bai1_30_NguyenVanHung {
    static Scanner sc = new Scanner(System.in);

    static int UCLN(int a, int b){
    if(b == 0) return a;
    return UCLN(b, a%b);
    }

    static Boolean checkSNT(int number){
        int count =0 ;
        for(int i = 2 ; i < number ; i++){
            if(number % i == 0)
            count ++;
        }
        if(count == 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("---------------------------Bai 5---------------------------");
        System.out.print("Nhap so a= ");
        int a = sc.nextInt();
        System.out.print("Nhap so a= ");
        int b = sc.nextInt();
        System.out.print("\n UCLN a= "+a+" va b= "+b+" la: " + UCLN(a, b) );
        System.out.println("---------------------------Bai 6---------------------------");
        System.out.print("Nhap so ktra nguyen to c= ");
        int c = sc.nextInt();
        if(checkSNT(c)){
            System.out.print(c + " khong la so nguyen to");
        }
        else{
            System.out.print(c + " la so nguyen to");
        }

    }
}
