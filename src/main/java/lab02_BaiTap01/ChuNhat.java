/*
 */
package lab02_BaiTap01;

public class ChuNhat {

    public double dai;
    public double rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("Hinh Chu Nhat Chieu dai= " + dai + ", Chieu rong= " + rong + ", Chu vi= " + getChuVi() + ", Dien tich= " + getDienTich());
    }
}
