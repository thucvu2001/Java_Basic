package HuongDoiTuongPhan1;

import java.util.Scanner;

public class Bai13 {
    private long tu;
    private long mau;

    public Bai13() {
        this.tu = this.mau = 0;
    }

    public Bai13(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public Bai13 tinhC(Bai13 phanSo1, Bai13 phanSo2) {
        Bai13 res = new Bai13();
        res.tu = phanSo1.tu * phanSo2.mau + phanSo2.tu * phanSo1.mau;
        res.tu *= res.tu;
        res.mau = phanSo1.mau * phanSo2.mau;
        res.mau *= res.mau;
        long ucln = gcd(res.tu, res.mau);
        res.tu /= ucln;
        res.mau /= ucln;
        return res;
    }

    public Bai13 nhan(Bai13 phanSo1, Bai13 phanSo2) {
        Bai13 res = new Bai13();
        res.tu = phanSo1.tu * phanSo2.tu;
        res.mau = phanSo1.mau * phanSo2.mau;
        long ucln = gcd(res.tu, res.mau);
        res.tu /= ucln;
        res.mau /= ucln;
        return res;
    }

    @Override
    public String toString() {
        String tmp = "";
        tmp += this.tu + "/" + this.mau;
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long tu1 = sc.nextLong();
            long mau1 = sc.nextLong();
            long tu2 = sc.nextLong();
            long mau2 = sc.nextLong();
            Bai13 phanSo1 = new Bai13(tu1, mau1);
            Bai13 phanSo2 = new Bai13(tu2, mau2);
            Bai13 C = new Bai13();
            Bai13 D = new Bai13();
            C = C.tinhC(phanSo1, phanSo2);
            System.out.print(C + " ");
            D = D.nhan(phanSo1, phanSo2);
            D = D.nhan(D, C);
            System.out.println(D);
        }
    }
}
