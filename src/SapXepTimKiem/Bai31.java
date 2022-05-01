// Dragon
package SapXepTimKiem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bai31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sucManh = sc.nextInt();
        Integer[][] a = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0] - o2[0];
            }
        });
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if (sucManh <= a[i][0]) {
                ok = false;
                break;
            } else {
                sucManh += a[i][1];
            }
        }
        if (ok) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
