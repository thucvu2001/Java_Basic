package HuongDoiTuongPhan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai24 {
    private String MSV;
    private String hoTen;
    private String ngaySinh;
    private String lop;
    private double GPA;

    public Bai24() {
    }

    public Bai24(int soThuTu, String hoTen, String lop, String ngaySinh, double GPA) {
        this.MSV = "SV" + String.format("%03d", soThuTu);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.GPA = GPA;
    }

    public String getMSV() {
        return this.MSV;
    }

    public double getGPA() {
        return this.GPA;
    }

    @Override
    public String toString() {
        return this.MSV + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.02f", this.GPA);
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

    public static String chuanHoaNgaySinh(String s) {
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
        int n = sc.nextInt();
        ArrayList<Bai24> sinhVien = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double GPA = sc.nextDouble();
            sinhVien.add(new Bai24(i, chuanHoaTen(ten), lop, chuanHoaNgaySinh(ngaySinh), GPA));
        }
        Collections.sort(sinhVien, new Comparator<Bai24>() {
            @Override
            public int compare(Bai24 o1, Bai24 o2) {
                String x = Double.toString(o1.getGPA());
                String y = Double.toString(o2.getGPA());
                return y.compareTo(x);
            }
        });
        for (Bai24 x : sinhVien) {
            System.out.println(x);
        }
    }
}
