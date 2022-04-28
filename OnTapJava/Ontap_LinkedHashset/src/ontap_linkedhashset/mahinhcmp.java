/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap_linkedhashset;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class mahinhcmp implements Comparator<HinhTron>{

    @Override
    public int compare(HinhTron o1, HinhTron o2) {
        return o1.getMahinh().compareTo(o2.getMahinh());
    }

    
    
}
