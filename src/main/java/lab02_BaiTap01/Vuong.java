/*
 */
package lab02_BaiTap01;

public class Vuong extends ChuNhat {

    public Vuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("Hinh Vuong Canh= " + rong + ", Chu vi= " + getChuVi() + ", Dien tich= " + getDienTich());
    }
}
