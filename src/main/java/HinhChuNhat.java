/*
 */

public class HinhChuNhat {

    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
        chieuDai = 2;
        chieuRong = 3;
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat " + "Chieu dai= " + chieuDai + ", Chieu rong= " + chieuRong + ", Chu vi= " + tinhChuVi() + ", Dien tich= " + tinhDienTich();
    }

}
