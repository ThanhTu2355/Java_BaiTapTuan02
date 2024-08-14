
import java.util.Scanner;

/*
 */
public class ChuongTrinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhChuNhat hcn1;
        HinhChuNhat hcn2;

        hcn1 = new HinhChuNhat();
        System.out.print("Nhap chieu dai: ");
        double dai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double rong = sc.nextDouble();
        hcn2 = new HinhChuNhat(dai, rong);

        System.out.println("Thong tin hcn1");
        System.out.println(hcn1);
        System.out.println("Thong tin hcn2");
        System.out.println(hcn2);
    }
}
