// Có n người nộp đơn và m căn hộ miễn phí. Nhiệm vụ của bạn là phân phối các căn hộ sao cho càng nhiều người đăng ký sẽ nhận được căn hộ càng tốt. Mỗi người nộp đơn có một kích thước căn hộ mong muốn, và họ sẽ chấp nhận bất kỳ căn hộ nào có diện tích đủ gần với kích thước mong muốn.
package SapXepTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0, cnt = 0;
        while (i < n && j < m) {
            if (Math.abs(a[i] - b[j]) <= k) {
                cnt++;
                i++;
                j++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                i++;
            }
        }
        System.out.println(cnt);
    }
}
