package HuongDoiTuongPhan1;

import java.util.Scanner;

public class Bai1 {
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private long tuSo;
    private long mauSo;

    public Bai1(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    @Override
    public String toString() {
        long ucln = gcd(this.tuSo, this.mauSo);
        long x = this.tuSo / ucln;
        long y = this.mauSo / ucln;
        String tmp = String.format(x + "/" + y);
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        Bai1 phanSo = new Bai1(tu, mau);
        System.out.println(phanSo.toString());
    }
}
