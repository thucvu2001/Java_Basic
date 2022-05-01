package HuongDoiTuongPhan1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai23 {
    private String MSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private double GPA;

    public Bai23() {
        this.MSV = this.hoTen = this.lop = this.ngaySinh = "";
        this.GPA = 0;
    }

    public Bai23(int soThuTu, String hoTen, String lop, String ngaySinh, double GPA) {
        this.MSV = "SV" + String.format("%03d", soThuTu);
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return this.MSV + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.2f", GPA);
    }

    public static String chuanHoaTen(String s) {
        String[] a = s.split("\\s+");
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < a[i].length(); j++) {
                if (j == 0) {
                    sb.append(Character.toUpperCase(a[i].charAt(j)));
                } else {
                    sb.append(Character.toLowerCase(a[i].charAt(j)));
                }
            }
            if (i == a.length - 1) {
                tmp.append(sb);
            } else {
                tmp.append(sb).append(" ");
            }
        }
        return tmp.toString();
    }

    public static String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Bai23> sinhVien = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double GPA = Double.parseDouble(sc.nextLine());
            sinhVien.add(new Bai23(i, chuanHoaTen(hoTen), lop, chuanHoa(ngaySinh), GPA));
        }
        for (Bai23 x : sinhVien) {
            System.out.println(x);
        }
    }
}
