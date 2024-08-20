/*
 */
package lab02_BaiTap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChuongTrinh {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> dssv = new ArrayList<>();
        String tiepTuc;
        do {
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien hoc luc Gioi");
            System.out.println("4. Sap xem danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc");
            System.out.print("Nhap chuc nang ban muon: ");
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    nhapDanhSachSV(dssv);
                    break;
                case 2:
                    xuatDanhSachSV(dssv);
                    break;
                case 3:
                    xuatSinhVienGioi(dssv);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.print("Khong co chuc nang nay. Moi Nhap lai");
            }
            System.out.print("\nBan co muon tiep tuc khong (Y/N): ");
            tiepTuc = sc.nextLine();
        } while (tiepTuc.equalsIgnoreCase("Y"));
    }

    public static void nhapDanhSachSV(ArrayList<SinhVien> dssv) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien: ");
        String ten = sc.nextLine();
        System.out.print("Nhap nganh sinh vien(IT / Biz): ");
        String nganh = sc.nextLine();
        if (nganh.equalsIgnoreCase("IT")) {
            System.out.print("Diem Java: ");
            double diemJava = sc.nextDouble();
            System.out.print("Diem Css: ");
            double diemCss = sc.nextDouble();
            System.out.print("Diem Html: ");
            double diemHtml = sc.nextDouble();
            sc.nextLine();

            SinhVien svIT = new SinhVienIT(diemJava, diemCss, diemHtml, ten, nganh);
            dssv.add(svIT);

        } else if (nganh.equalsIgnoreCase("Biz")) {
            System.out.print("Diem Marketing: ");
            double diemMarketing = sc.nextDouble();
            System.out.print("Diem Sales: ");
            double diemSales = sc.nextDouble();
            sc.nextLine();

            SinhVien svBiz = new SinhVienBiz(diemMarketing, diemSales, ten, nganh);
            dssv.add(svBiz);
        }
    }

    public static void xuatDanhSachSV(ArrayList<SinhVien> dssv) {
        for (SinhVien sv : dssv) {
            sv.xuat();
            System.out.println("--------------------");
        }
    }

    public static void xuatSinhVienGioi(ArrayList<SinhVien> dssv) {
        for (SinhVien sv : dssv) {
            if (sv.getHocLuc().equalsIgnoreCase("gioi")) {
                sv.xuat();
                System.out.println("--------------------");
            }
        }
    }
}
