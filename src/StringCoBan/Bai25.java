package StringCoBan;

import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();
        boolean ok = true;
        if (m * 9 < s || (s == 0 && m >= 2)) {
            System.out.println("NOT FOUND");
            ok = false;
        }
        if (ok == true) {
            int tmp = s;
            int[] a = new int[m];
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                if (s >= 9) {
                    a[i] = 9;
                    s -= 9;
                } else {
                    a[i] = s;
                    s = 0;
                }
            }
            --tmp;
            for (int i = m - 1; i > 0; i--) {
                if (tmp >= 9) {
                    b[i] = 9;
                    tmp -= 9;
                } else {
                    b[i] = tmp;
                    tmp = 0;
                }
            }
            b[0] = tmp + 1;
            for (int x : b) {
                System.out.print(x);
            }
            System.out.println();
            for (int x : a) {
                System.out.print(x);
            }
        }
    }
}
