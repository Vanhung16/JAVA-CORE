import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class demo {



    public static void main(String[] args) {
        // Tạo một LinkedList có kiểu dữ liệu là Integer
         Random rand = new Random();
         Scanner sc = new Scanner(System.in);
         int soPhanTu;
        LinkedList<Integer> list = new LinkedList<Integer>();
        // Sử dụng method thêm phần tử vào danh sách
        while (soPhanTu < 10) {
            list.add(rand.nextInt(100)+1);
            soPhanTu++;
        }
        // list.add(5);
        System.out.println(list);
        // sử dụng method max để tìm ra phần tử lớn nhất trong danh sách
        Integer x = Collections.max(list);
        // sử dụng method max để tìm ra phần tử nh�? nhất trong danh sách
        Integer y = Collections.min(list);
        System.out.println(x);
        System.out.println(y);
        // sử dụng method sort để sắp xếp các phần tử trong danh sách tăng dần
        Collections.sort(list);
        System.out.println(list);
    }
}
// KQ
// [3, 4, 2, 7, 5]
// 7
// 2
// [2, 3, 4, 5, 7]
