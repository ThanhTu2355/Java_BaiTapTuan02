/*
 */
package BaiTap04;

public class HinhTru extends HinhTron {

    private double chieuCao;

    public HinhTru() {
        super();
        chieuCao = 2;
    }

    public HinhTru(double banKinh, double chieuCao) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhDienTich() {
        return super.tinhDienTich() * 2 + super.tinhChuVi() * chieuCao;
    }

    public double tinhTheTich() {
        return super.tinhDienTich() * chieuCao;
    }
}
