package HuongDoiTuongPhan1;

import java.util.Scanner;

public class Bai2 {
    private String hoTen;
    private String ngaySinh;
    double mon1;
    double mon2;
    double mon3;

    public Bai2(String hoTen, String ngaySinh, double mon1, double mon2, double mon3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    @Override
    public String toString() {
        double x = this.mon1 + this.mon2 + this.mon3;
        String diem = String.format("%.1f", x);
        String tmp = this.hoTen + " " + this.ngaySinh + " " + diem;
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String ngaySinh = sc.nextLine();
        double mon1 = sc.nextDouble();
        double mon2 = sc.nextDouble();
        double mon3 = sc.nextDouble();
        Bai2 SinhVien = new Bai2(ten, ngaySinh, mon1, mon2, mon3);
        System.out.println(SinhVien.toString());
    }
}
