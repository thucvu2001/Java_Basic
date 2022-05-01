package HuongDoiTuongPhan1;

import java.util.Scanner;

public class Bai4 {
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String hopDong;

    public Bai4(String ten, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String hopDong) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.hopDong = hopDong;
    }

    @Override
    public String toString() {
        String tmp = "00001" + " " + this.ten + " " + this.gioiTinh + " " + this.ngaySinh + " " + this.diaChi + " " + this.maSoThue + " " + this.hopDong;
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
        Bai4 NhanVien = new Bai4(ten, gioiTinh, ngaySinh, diaChi, maSoThue, hopDong);
        System.out.println(NhanVien.toString());
    }
}
