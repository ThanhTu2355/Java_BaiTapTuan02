/*
 */
package lab02_BaiTap02;

public class SinhVienIT extends SinhVien {

    public double diemJava;
    public double diemCss;
    public double diemHtml;

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemCss + diemHtml) / 4;
    }
}
