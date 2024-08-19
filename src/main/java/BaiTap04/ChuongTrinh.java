/*
 */
package BaiTap04;

public class ChuongTrinh {

    public static void main(String[] args) {
        HinhTron htron = new HinhTron(5);
        System.out.println(htron);
        HinhTru htru = new HinhTru(3, 5);
        System.out.println("HinhTru" + " Ban Kinh= " + htru.getBanKinh() + ", Chieu Cao= " + htru.getChieuCao() 
                                     + ", Dien Tich= " + htru.tinhDienTich() + " The Tich= " + htru.tinhTheTich());
    }
}
