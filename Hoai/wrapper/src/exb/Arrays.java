/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exb;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {

    String[] arrayA = {
        "dog", "cat", "rat", "fox", "frog",
        "dinosaur", "cow", "bull", "dog", "dog", "dog"
    };

    String[] arrayB = {
        "dog", "dog", "cat", "dog", "frog", "rat", "turtle",
        "fox", "fox", "man", "man", "frog", "man"
    };

    //toi uu mang A
    public void toiuu() {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, arrayA);
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    --n;
                    --j;
                }
            }
        }
        String[] arrayC = new String[list.size()];
        arrayC = list.toArray(arrayC);
        arrayA = arrayC;
        System.out.println("Danh sach sau khi toi uu:");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i] + " ");
        }
    }

    public void compare() {
        for (int indexA = 0; indexA < arrayA.length; indexA++) {
            int counter = 0;
            for (int indexB = 0; indexB < arrayB.length; indexB++) {
                if (arrayA[indexA] == arrayB[indexB]) {
                    counter++;
                }
            }// end for

            if (counter > 0) {
                System.out.println(arrayA[indexA] + "  " + counter);
            }
        }// end for
    }//end compare()

    public static void main(String args[]) {
        Arrays a = new Arrays();
        a.toiuu();
        a.compare();
    }
}// end class Arrays	

