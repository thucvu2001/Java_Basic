// Đại học Bang Berland đang tổ chức một buổi khiêu vũ trong lễ kỷ niệm 100500 năm thành lập! n các chàng trai và m cô gái đã bận rộn luyện tập các động tác nhảy múa. Chúng tôi biết rằng một số cặp nam và nữ sẽ được mời tham dự vũ hội. Tuy nhiên, kỹ năng khiêu vũ của các đối tác trong mỗi cặp khác nhau nhiều nhất là một đơn vị. Đối với mỗi cậu bé, chúng tôi biết kỹ năng nhảy của cậu ấy. Tương tự, đối với mỗi cô gái, chúng tôi biết kỹ năng khiêu vũ của cô ấy. Viết mã xác định số cặp lớn nhất có thể được hình thành từ n trai và m gái.
package SapXepTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
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
            if (Math.abs(a[i] - b[j]) <= 1) {
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
