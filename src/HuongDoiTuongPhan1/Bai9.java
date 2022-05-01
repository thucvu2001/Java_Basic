package HuongDoiTuongPhan1;

import java.util.Scanner;

public class Bai9 {
    private String ma;
    private String ten;
    private int luongCoBan;

    public Bai9(String ma, String ten, int luong) {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luong;
    }

    @Override
    public String toString() {
        int luong = 0;
        int heSo = (ma.charAt(2) - '0') * 10 + (ma.charAt(3) - '0');
        luong += luongCoBan * heSo;
        String chucVu = ma.substring(0, 2);
        if (chucVu.equals("HT")) {
            luong += 2000000;
        } else if (chucVu.equals("HP")) {
            luong += 900000;
        } else {
            luong += 500000;
        }
        String ketQua = this.ma + " " + this.ten + " ";
        if (ma.charAt(2) != '0') {
            ketQua += ma.charAt(2);
        }
        ketQua += ma.charAt(3) + " " + luong;
        return ketQua;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.next();
        sc.nextLine();
        String ten = sc.nextLine();
        int luong = sc.nextInt();
        Bai9 ThuNhap = new Bai9(ma, ten, luong);
        System.out.println(ThuNhap);
    }
}
