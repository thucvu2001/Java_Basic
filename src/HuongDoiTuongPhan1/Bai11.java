package HuongDoiTuongPhan1;

import java.util.Scanner;

public class Bai11 {
    private String ten;
    private int luongCoBan;
    private int ngayCong;
    private String chucVu;

    public Bai11(String ten, int luongCoBan, int ngayCong, String chucVu) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }

    @Override
    public String toString() {
        long luongThang = (long) this.luongCoBan * this.ngayCong;
        int thuong = 0;
        if (ngayCong >= 25) {
            thuong = (int) (luongThang / 100) * 20;
        } else if (ngayCong >= 22) {
            thuong = (int) (luongThang / 100) * 10;
        }
        int phuCap;
        if (chucVu.equals("GD")) {
            phuCap = 250000;
        } else if (chucVu.equals("PGD")) {
            phuCap = 200000;
        } else if (chucVu.equals("TP")) {
            phuCap = 180000;
        } else {
            phuCap = 150000;
        }
        long thuNhap = luongThang + thuong + phuCap;
        return "NV01 " + this.ten + " " + luongThang + " " + thuong + " " + phuCap + " " + thuNhap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int luongCoBan = sc.nextInt();
        int ngayCong = sc.nextInt();
        sc.nextLine();
        String chucVu = sc.nextLine();
        Bai11 luongNhanVien = new Bai11(ten, luongCoBan, ngayCong, chucVu);
        System.out.println(luongNhanVien);
    }
}
