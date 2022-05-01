package HuongDoiTuongPhan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai22 {
    private String MSV;
    private String hoTen;
    private String ngaySinh;
    private String lop;
    private double GPA;

    public Bai22() {
    }

    public Bai22(int soThuTu, String hoTen, String ngaySinh, String lop, double GPA) {
        this.MSV = "SV" + String.format("%03d", soThuTu);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return this.MSV + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.2f", this.GPA);
    }

    public static String chuanHoa (String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, "0");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Bai22> sinhVien = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double GPA = Double.parseDouble(sc.nextLine());
            sinhVien.add(new Bai22(i + 1, hoTen, chuanHoa(ngaySinh), lop, GPA));
        }
        for(Bai22 x : sinhVien){
            System.out.println(x);
        }
    }
}
