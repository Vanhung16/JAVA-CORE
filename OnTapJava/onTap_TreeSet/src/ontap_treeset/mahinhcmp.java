/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap_treeset;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class mahinhcmp implements Comparator<HinhTamGiac>{

    @Override
    public int compare(HinhTamGiac o1, HinhTamGiac o2) {
        return o1.getMahinh()-o2.getMahinh();
    }

    
    
}
