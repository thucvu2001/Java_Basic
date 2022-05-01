package HuongDoiTuongPhan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai20 {
    private int gio;
    private int phut;
    private int giay;

    public Bai20(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public String toString() {
        return this.gio + " " + this.phut + " " + this.giay;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Bai20> lopTime = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            lopTime.add(new Bai20(gio, phut, giay));
        }
        Collections.sort(lopTime, new Comparator<Bai20>() {
            @Override
            public int compare(Bai20 o1, Bai20 o2) {
                if (o1.gio != o2.gio) {
                    return o1.gio - o2.gio;
                } else if (o1.phut != o2.phut) {
                    return o1.phut - o2.phut;
                } else {
                    return o1.giay - o2.giay;
                }
            }
        });
        for (int i = 0; i < lopTime.size(); i++) {
            System.out.println(lopTime.get(i));
        }
    }
}
