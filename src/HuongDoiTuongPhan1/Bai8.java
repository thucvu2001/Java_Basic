package HuongDoiTuongPhan1;

import java.util.Scanner;

public class Bai8 {
    public double x;
    public double y;

    public Bai8() {
        this.x = this.y = 0;
    }

    public Bai8(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double khoangCach(Bai8 diem1, Bai8 diem2) {
        double kc = Math.sqrt(Math.pow(diem1.getX() - diem2.getX(), 2) + Math.pow(diem1.getY() - diem2.getY(), 2));
        return kc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Bai8 diemA = new Bai8(x1, y1);
            Bai8 diemB = new Bai8(x2, y2);
            Bai8 diemC = new Bai8(x3, y3);
            double AB = khoangCach(diemA, diemB);
            double AC = khoangCach(diemA, diemC);
            double BC = khoangCach(diemB, diemC);
            if (AB + AC > BC && AB + BC > AC && AC + BC > AB) {
                double chuVi = AB + AC + BC;
                double p = chuVi / 2;
                double dienTich = Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));
                System.out.printf("%.3f ", chuVi);
                System.out.printf("%.3f", dienTich);
                System.out.println();
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
