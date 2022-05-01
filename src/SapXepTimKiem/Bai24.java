// Một dãy gồm n số nguyên không âm a1, a2,..., an được viết thành một hàng ngang, giữa hai số liên tiếp có một khoảng trắng,
// như vậy có tất cả (n-1) khoảng trắng. Người ta muốn đặt k dấu cộng và (n-1-k) dấu trừ vào (n-1) khoảng trắng đó để nhận được một biểu thức có giá trị lớn nhất.
// Ví dụ, với dãy gồm 5 số nguyên 28, 9, 5, 1, 69 và k = 2 thì cách đặt 28+9-5-1+69 là biểu thức có giá trị lớn nhất.
// Yêu cầu: Cho dãy gồm n số nguyên không âm a1, a2,..., an và số nguyên dương k, hãy tìm cách đặt k dấu cộng và (n-1-k) dấu trừ vào (n-1) khoảng trắng
// để nhận được một biểu thức có giá trị lớn nhất.
package SapXepTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, 1, n-1);
        long ans = a[0];
        for (int i = n - 1; i > 0; i--) {
            if (k > 0) {
                ans += a[i];
            } else {
                ans -= a[i];
            }
            k--;
        }
        System.out.println(ans);
    }
}
