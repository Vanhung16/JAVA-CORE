
package bai4_phieu5_nguyenvanhung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class HoaDon {
    private String soHD, ngayHD;
    private KhachHang kh = new KhachHang();
    private ArrayList<Hang> dsHang = new ArrayList<Hang>();
    private float tongTienHang = 0;

    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public String getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public List<Hang> getDsHang() {
        return dsHang;
    }

    public void setDsHang(ArrayList<Hang> dsHang) {
        this.dsHang = dsHang;
    }

    

    public float getTongTienHang() {
        return tongTienHang;
    }

    public void setTongTienHang(float tongTienHang) {
        this.tongTienHang = tongTienHang;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hoa don: ");
        soHD = sc.nextLine();
        System.out.println("nhap ngay hoa don: ");
        ngayHD = sc.nextLine();
        System.out.println("nhap khach hang: ");
        kh.nhap();
        System.out.println("nhap danh sach hang: ");
        System.out.println("nhap so danh sach hang: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            Hang e = new Hang();
            e.nhap();
            dsHang.add(e);
        }
    }
    public void inHD(){
        System.out.print("Ma HD: " + soHD);        
        System.out.print("Ngay ban: " + ngayHD);
        System.out.println("Khach Hang: " + kh.getHoten());
        System.out.println("Dia chi: " + kh.getDiachi());
//        dsHang.forEach(hang -> {
//            hang.inDL();
//        });
//        System.out.printf("%10s %10.1f %10.1f %15.0f%n", "ten hang", "so luong", "don gia", "tong");

        for (Hang hang : dsHang) {
            hang.inDL();

        }
    }
//    public void sortds(){
//        Collections.sort(dsHang);
//    }
    @Override
    public String toString() {
        return "HoaDon{" + "soHD=" + soHD + ", ngayHD=" + ngayHD  + ", kh=" + kh + ", dsHang=" + dsHang + ", tongTienHang=" + tongTienHang + '}';
    }
    
}
