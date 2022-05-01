package SapXepTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int cnt = 0, i = 0, j = n - 1;
        while (i < j) {
            cnt++;
            if (a[j] + a[i] <= x) {
                i++;
            }
            j--;
        }
        if (i == j) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
