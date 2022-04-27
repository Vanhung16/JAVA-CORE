/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;


public abstract class DaGiac {

    protected String mahinh;
    protected String tenhinh;
    protected int dsCanh[];

    public int tinhCV(){
         int chuvi = 0;
        
        for (int i = 0; i < dsCanh.length ; i++) {
            chuvi += dsCanh[i];
        }
        return chuvi;
    }
    
    public abstract int tinhDT();
    public abstract void nhapDL();

    @Override
    public String toString() {
        return "DaGiac{" + "chu vi=" + tinhCV() + ", dien tich=" + tinhDT() +  '}';
    }
}
