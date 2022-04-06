package bai1;

public class NhanVien {

    private String maNV;
    private int soSP;

    public NhanVien() {
    }

    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        this.soSP = soSP;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) throws Exception {
        if(soSP < 0) throw new Exception("so sp > 0");
        this.soSP = soSP;
    }

    public Boolean coVuotChuan() {
        if (soSP > 500) {
            return true;
        }
        return false;
    }

    public String getTongKet() {
        if (coVuotChuan() == true) {
            return "vuot";
        }
        return "";
    }

    public double getLuong() {
        if (coVuotChuan() == true) {
            return soSP * 30000;
        }
        return soSP * 20000;
    }

    public static void xuatTieuDe() {
        System.out.printf("%20s %15s %15s %10s%n", "ma nhan vien", "so san pham", "luong", "tong ket");
    }

    public void inDL() {
        System.out.printf("%20s %15s %15s %10s%n", maNV, soSP, getLuong(), coVuotChuan());
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", soSP=" + soSP + '}';
    }
    
}
