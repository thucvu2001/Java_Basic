// Tại sân bay, mọi người đang làm thủ tục để check in. Có tất cả N vị khách. Vị khách thứ i tới làm thủ tục tại thời điểm T[i] và cần D[i] thời gian để check in xong.
// Các bạn hãy xác định xem thời điểm nào tất cả các vị khách làm xong thủ tục để lên máy bay?
package SapXepTimKiem;

import java.util.*;

public class Bai25 {
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
                return o1[0] - o2[0];
            }
        });
        long endTime = a[0][0] + a[0][1];
        for (int i = 1; i < n; i++) {
            endTime = Math.max(a[i][0], endTime);
            endTime += a[i][1];
        }
        System.out.println(endTime);
    }
}
