// Bạn được cho biết thời gian đến và đi của n khách hàng trong một nhà hàng. Số lượng khách hàng có mặt tại cửa hàng ở 1 thời điểm nhiều nhất là bao nhiêu?
package SapXepTimKiem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bai37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] a = new Integer[2 * n][2];
        for (int i = 0; i < 2 * n; i += 2) {
            a[i][0] = sc.nextInt();
            a[i][1] = 1;
            a[i + 1][0] = sc.nextInt();
            a[i + 1][1] = -1;
        }
        Arrays.sort(a, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0] - o2[0];
            }
        });
        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < 2 * n; i++) {
            cnt += a[i][1];
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
}
