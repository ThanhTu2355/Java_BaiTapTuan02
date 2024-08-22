/*
 */
package BaiTap04;

public class HinhTron {

    double banKinh;

    public HinhTron() {
        banKinh = 1;
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double tinhDienTich() {
        return 2 * Math.PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron" + " Ban Kinh= " + banKinh + ", Chu vi= " + tinhChuVi() + ", Dien Tich= " + tinhDienTich();
    }

}
