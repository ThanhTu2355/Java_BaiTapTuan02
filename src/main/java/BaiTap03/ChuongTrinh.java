/*
 */
package BaiTap03;

import java.util.Scanner;
import java.util.ArrayList;

public class ChuongTrinh {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        String tiepTuc;
        ArrayList<SanPham> sanPham = new ArrayList<>();
        do {
            System.out.println("0. Thoat");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. In danh sach");
            System.out.println("3. Sap xep giam dan theo gia");
            System.out.println("4. Tim va xoa san pham theo ten");
            System.out.println("5. Xuat gia trung binh");
            System.out.print("Nhap chuc nang ban muon: ");
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 0:
                    System.out.println("Chao tam biet. Hen gap lai!!!");
                    return;
                case 1:
                    nhapDanhSachSP(sanPham);
                    break;
                case 2:
                    inDanhDach(sanPham);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    double giaTB = tinhTrungBinh(sanPham);
                    System.out.print(giaTB);
                    break;
                default:
                    System.out.print("Khong co chuc nang nay. Moi Nhap lai");
            }
            System.out.println("\nBan co muon tiep tuc khong (Y/N)");
            tiepTuc = sc.nextLine();
        } while (tiepTuc.equalsIgnoreCase("Y"));
    }

    public static void nhapDanhSachSP(ArrayList<SanPham> sanPham) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        String ten = sc.nextLine();
        System.out.print("Nhap gia san pham: ");
        int gia = sc.nextInt();
        SanPham sp = new SanPham(ten, gia);
        sanPham.add(sp);
    }

    public static void inDanhDach(ArrayList<SanPham> sanPham) {
        for (SanPham sanPham1 : sanPham) {
            System.out.print(sanPham1 + "\n");
        }
    }

    public static double tinhTrungBinh(ArrayList<SanPham> sanPham) {
        if (sanPham.isEmpty()) {
            return 0;
        }
        int tongGia = 0;
        for (SanPham sanPham1 : sanPham) {
            tongGia += sanPham1.getGia();
        }
        return (double) tongGia / sanPham.size();
    }
}
