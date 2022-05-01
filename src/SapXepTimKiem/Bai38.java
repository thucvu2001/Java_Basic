package SapXepTimKiem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bai38 {
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
                return o1[1] - o2[1];
            }
        });
        int ans = 1, tmp = a[0][1];
        for (int i = 1; i < n; i++) {
            if (tmp <= a[i][0]) {
                ans++;
                tmp = a[i][1];
            }
        }
        System.out.println(ans);
    }
}
