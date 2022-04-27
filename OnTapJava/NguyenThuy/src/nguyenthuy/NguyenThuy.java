/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nguyenthuy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NguyenThuy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Tạo một LinkedList có kiểu dữ liệu là Integer
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int soPhanTu = 0;
        LinkedList<Integer> list = new LinkedList<>();
        // Sử dụng method thêm phần tử vào danh sách
        while (soPhanTu < 5) {
            list.add(rand.nextInt(100) + 1);
            soPhanTu++;
        }
        //thêm 1 phần tử vào đầu mảng
        list.addFirst(999);
        System.out.println("==========Danh Sach==========");
        System.out.println(list);
        // sử dụng method max để tìm ra phần tử lớn nhất trong danh sách
        Integer x = Collections.max(list);
        System.out.println("==========Phan tu lon nhat==========");
        System.out.println(x);
        //Lấy phần tử: lấy phần tử thứ nhất trong tập hợp
        System.out.println("==========Phan tu dau tien==========");
        System.out.println(list.getFirst());
        // sử dụng method max để tìm ra phần tử nhỏ nhất trong danh sách
        System.out.println("==========Phan tu nho nhat==========");
        Integer y = Collections.min(list);
        System.out.println(y);
        // sử dụng method sort để sắp xếp các phần tử trong danh sách tăng dần
        System.out.println("==========Danh sach sap xep==========");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("==========Xoa phan tu cuoi danh sach==========");
        // sử dụng method removeLast()
        list.removeLast();
        System.out.println(list);
        System.out.println("==========Sua phan tu==========");
        //sử dụng method set() để sửa giá trị của tập hợp
        list.set(1, 888);
        System.out.println(list);
    }
    
}
