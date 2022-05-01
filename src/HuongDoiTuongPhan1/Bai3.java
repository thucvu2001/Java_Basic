package HuongDoiTuongPhan1;

import java.util.Scanner;

public class Bai3 {
    private String msv;
    private String name;
    private String lop;
    private String birth;
    private double gpa;

    public Bai3() {
        msv = name = lop = birth = "";
        gpa = 0;
    }

    public Bai3(int soThuTu, String name, String lop, String birth, double gpa) {
        String ma;
        if (soThuTu < 10) {
            ma = "SV00" + soThuTu;
        } else {
            ma = "SV0" + soThuTu;
        }
        this.msv = ma;
        this.name = name;
        this.lop = lop;
        this.birth = birth;
        this.gpa = gpa;
    }

    public static String chuanHoa(String ngaySinh) {
        StringBuilder sb = new StringBuilder(ngaySinh);
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
        String diemSo = String.format("%.1f", this.gpa);
        return this.msv + " " + this.name + " " + this.lop + " " + this.birth + " " + diemSo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String lop = sc.nextLine();
        String ngaySinh = sc.nextLine();
        double diem = sc.nextDouble();
        Bai3 SinhVien = new Bai3(1, ten, lop, chuanHoa(ngaySinh), diem);
        System.out.println(SinhVien.toString());
    }
}
