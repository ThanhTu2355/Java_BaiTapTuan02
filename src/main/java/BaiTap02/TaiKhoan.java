/*
 */
package BaiTap02;

public class TaiKhoan {

    private String id;
    private String name;
    private int soDu;

    public TaiKhoan() {
    }

    public TaiKhoan(String id, String name, int soDu) {
        this.id = id;
        this.name = name;
        this.soDu = soDu;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSoDu() {
        return soDu;
    }

    public void napTien(int amount) {
        soDu += amount;
    }

    public void rutTien(int amount) {
        if (soDu >= amount) {
            soDu -= amount;
        } else {
            System.out.println("Giao dich khong thanh cong!");
        }
    }

    public void chuyenTien(TaiKhoan other, int amount) {
        if (soDu >= amount) {
            soDu -= amount;
            other.soDu += amount;
        } else {
            System.out.println("Giao dich khong thanh cong!");
        }
    }
}
