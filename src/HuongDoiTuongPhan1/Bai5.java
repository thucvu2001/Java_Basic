package HuongDoiTuongPhan1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai5 {
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String hopDong;

    public Bai5(String ten, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String hopDong) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.hopDong = hopDong;
    }

    public static String chuanHoaTen(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return sb.toString();
    }

    public static String chuanHoaNgay(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        String ten2 = "";
        String[] a = this.ten.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            ten2 += chuanHoaTen(a[i]) + " ";
        }
        String ngaySinh2 = chuanHoaNgay(this.ngaySinh);
        String hopDong2 = chuanHoaNgay(this.hopDong);
        String tmp = "00001 " + ten2 + this.gioiTinh + " " + ngaySinh2 + " " + this.diaChi + " " + this.maSoThue + " " + hopDong2;
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String gioiTinh = sc.nextLine();
        String ngaySinh = sc.nextLine();
        String diaChi = sc.nextLine();
        String maSoThue = sc.nextLine();
        String hopDong = sc.nextLine();
        Bai5 NhanVien = new Bai5(ten, gioiTinh, ngaySinh, diaChi, maSoThue, hopDong);
        System.out.println(NhanVien.toString());
    }
}
