package HuongDoiTuongPhan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai21 {
    private String ma;
    private String ten;
    private String donVi;
    private int giaMua;
    private int giaBan;

    public Bai21(int soThuTu, String ten, String donVi, int giaMua, int giaBan) {
        String ma = "MH";
        if (soThuTu < 10) {
            ma += "000" + soThuTu;
        } else if (soThuTu < 100) {
            ma += "00" + soThuTu;
        } else if (soThuTu < 1000) {
            ma += "0" + soThuTu;
        } else {
            ma += soThuTu;
        }
        this.ma = ma;
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getLoiNhuan() {
        return this.giaBan - this.giaMua;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.donVi + " " + this.giaMua + " " + this.giaBan + " " + this.getLoiNhuan();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Bai21> MatHang = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            String donVi = sc.nextLine();
            int giaMua = sc.nextInt();
            int giaBan = sc.nextInt();
            MatHang.add(new Bai21(i, ten, donVi, giaMua, giaBan));
        }
        Collections.sort(MatHang, new Comparator<Bai21>() {
            @Override
            public int compare(Bai21 o1, Bai21 o2) {
                if (o1.getLoiNhuan() != o2.getLoiNhuan()) {
                    return o2.getLoiNhuan() - o1.getLoiNhuan();
                } else {
                    return o1.getMa().compareTo(o2.getMa());
                }
            }
        });
        for (Bai21 x : MatHang) {
            System.out.println(x);
        }
    }
}
