package HuongDoiTuongPhan1;

import java.util.Scanner;

public class Bai10 {
    private double x;
    private double y;

    public Bai10() {
        this.x = this.y = 0;
    }

    public Bai10(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double khoangCach(Bai10 diemA, Bai10 diemB) {
        double kc = Math.sqrt(Math.pow(diemA.getX() - diemB.getX(), 2) + Math.pow(diemA.getY() - diemB.getY(), 2));
        return kc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.14;
        int t = sc.nextInt();
        while (t-- > 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Bai10 diemA = new Bai10(x1, y1);
            Bai10 diemB = new Bai10(x2, y2);
            Bai10 diemC = new Bai10(x3, y3);
            double AB = khoangCach(diemA, diemB);
            double AC = khoangCach(diemA, diemC);
            double BC = khoangCach(diemB, diemC);
            if (AB + AC > BC && AB + BC > AC && AC + BC > AB) {
                double p = (AB + AC + BC) / 2;
                double S = Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));
                double R = (AB * AC * BC) / (4 * S);
                double S2 = PI * R * R;
                System.out.printf("%.3f", S2);
                System.out.println();
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
