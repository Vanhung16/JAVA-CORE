/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1_hinhphang;

/**
 *
 * @author Admin
 */
abstract class HinhPhang {

    abstract int tinhCV();

    abstract int tinhDT();

    @Override
    public String toString() {
        return "HinhPhang{" + "chu vi= "+tinhCV()+"dien tich= "+tinhDT()+'}';
    }
    abstract void xuat();
        

}
