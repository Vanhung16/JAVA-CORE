package bai10_11_17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class bai10 {
    static Scanner sc = new Scanner(System.in);
    static void nhapmang(ArrayList<Integer> a, int n){
        
        Random rand = new Random();
        for(int i = 0 ; i < n ; i++){
            a.add(rand.nextInt(100) + 1);
        }
    }
    static void xuatmang(ArrayList<Integer> a){
        for (Integer integer : a) {
            System.out.print(integer + "\t");
        }
    }
    static Boolean checkSNT(int number){
        if(number == 1 || number == 0 || number < 0){
            return false;
        }else{
            int count = 0;
            for(int i = 2 ; i <= number; i++){
                if(number % i == 0){
                    count++;
                }
            }
            if(count == 1){
                return true;
            }
            else{
                return false;
            }
        }
    }
    static ArrayList<Integer> tachMangSNT(ArrayList<Integer> a){
        ArrayList<Integer> snt = new ArrayList<Integer>();
        for (Integer integer : a) {
            if(checkSNT(integer) == true){
                snt.add(integer);
            }
        }
        Collections.sort(snt);
        return snt;
    }
    static ArrayList<Integer> tachMang(ArrayList<Integer> a){
        ArrayList<Integer> snt = new ArrayList<Integer>();
        for (Integer integer : a) {
            if(checkSNT(integer) == false){
                snt.add(integer);
            }
        }
        Collections.sort(snt);
        return snt;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = sc.nextInt();
        nhapmang(a,n);

        xuatmang(a);
        System.out.println("--------------------");
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<Integer> d = new ArrayList<Integer>();
        c = tachMangSNT(a);
        d = tachMang(a);
        c.addAll(d);
        xuatmang(c);
    }
}
