// Cho mảng A[] gồm N phần tử và số X. Nhiệm vụ của bạn là tìm cặp phần tử A[i] - A[j] = X. Nếu tồn tại A[i] - A[j] = X đưa ra 1, ngược lại đưa ra -1.n
package SapXepTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai26 {
    public static int bs(int[] a, int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) {
                res = m;
                return res;
            } else if (a[m] > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int check = -1;
        for (int i = 0; i < n; i++) {
            int tmp = bs(a, 0, n - 1, a[i] + x);
            if (tmp != -1) {
                check = 1;
                break;
            }
        }
        System.out.println(check);
    }
}
