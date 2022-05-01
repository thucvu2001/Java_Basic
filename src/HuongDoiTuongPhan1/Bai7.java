package HuongDoiTuongPhan1;

import java.awt.*;
import java.util.Scanner;

public class Bai7 {
    private double x;
    private double y;

    public Bai7() {
        this.x = this.y = 0;
    }

    public Bai7(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double khoangCach(Bai7 diem1, Bai7 diem2) {
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
            Bai7 Point1 = new Bai7(x1, y1);
            Bai7 Point2 = new Bai7(x2, y2);
            double kc = khoangCach(Point1, Point2);
            System.out.printf("%.4f", kc);
            System.out.println();
        }
    }
}
