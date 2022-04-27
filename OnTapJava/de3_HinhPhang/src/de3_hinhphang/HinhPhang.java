/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de3_hinhphang;

/**
 *
 * @author Admin
 */
public abstract class HinhPhang {

    abstract int tinhCV();

    abstract float tinhDT();

    @Override
    public String toString() {
        return "HinhPhang{" + "Chu vi= "+tinhCV()+"Dien tich= "+tinhDT()+ '}';
    }
    

}
