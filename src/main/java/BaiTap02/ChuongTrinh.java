/*
 */
package BaiTap02;

public class ChuongTrinh {

    public static void main(String[] args) {
        TaiKhoan tk1;
        TaiKhoan tk2;

        tk1 = new TaiKhoan("001", "Chuno", 30000000);
        tk2 = new TaiKhoan("002", "Conno", 5000000);

        System.out.println("THONG TIN TAI KHOAN");
        System.out.println("id: " + tk1.getId() + " name: " + tk1.getName() + " So du: " + tk1.getSoDu());
        System.out.println("id: " + tk2.getId() + " name: " + tk2.getName() + " So du: " + tk2.getSoDu());

        tk1.napTien(70000000);
        tk2.napTien(5000000);
        System.out.println("SAU KHI RUT-NAP TIEN");
        System.out.println("id: " + tk1.getId() + " name: " + tk1.getName() + " So du: " + tk1.getSoDu());
        System.out.println("id: " + tk2.getId() + " name: " + tk2.getName() + " So du: " + tk2.getSoDu());

        tk2.chuyenTien(tk1, 10000000);
        System.out.println("TAI KHOAN SAU KHI CHUYEN KHOAN");
        System.out.println("id: " + tk1.getId() + " name: " + tk1.getName() + " So du: " + tk1.getSoDu());
        System.out.println("id: " + tk2.getId() + " name: " + tk2.getName() + " So du: " + tk2.getSoDu());
    }
}
