package SapXepTimKiem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] a = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1] - o2[1]; // thoi gian ket thuc tang dan
            }
        });
        int ans = 1, endTime = a[0][1];
        for (int i = 1; i < n; i++) {
            if (a[i][0] > endTime) {
                ans++;
                endTime = a[i][1];
            }
        }
        System.out.println(ans);
    }
}
