package HuongDoiTuongPhan1;

import java.util.Scanner;

public class Bai6 {
    public static String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return sb.toString();
    }

    private double Width;
    private double Height;
    private String Color;

    public Bai6() {
        this.Width = this.Height = 0;
        this.Color = "";
    }

    public Bai6(double width, double height, String color) {
        Width = width;
        Height = height;
        Color = chuanHoa(color);
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = chuanHoa(color);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai6 HinhChuNhat = new Bai6();
        HinhChuNhat.setWidth(sc.nextDouble());
        HinhChuNhat.setHeight(sc.nextDouble());
        HinhChuNhat.setColor(sc.next());
        if (HinhChuNhat.getHeight() < 1 || HinhChuNhat.getWidth() < 1) {
            System.out.println("INVALID");
            return;
        }
        double chuVi = 2 * (HinhChuNhat.getHeight() + HinhChuNhat.getWidth());
        double dienTich = HinhChuNhat.getHeight() * HinhChuNhat.getWidth();

        System.out.printf("%.0f ", chuVi);
        System.out.printf("%.0f ", dienTich);
        System.out.println(HinhChuNhat.getColor());
    }
}
