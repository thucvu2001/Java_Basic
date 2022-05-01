// Cho mảng A[] gồm n phần tử. Nhiệm vụ của bạn là tìm giá trị nhỏ nhất (phải thuộc mảng A[]) lớn hơn A[i] (i=0, 1, 2,.., n-1).
// Đưa ra ‘_’ nếu A[i] không có phần tử nhỏ hơn nó.
// Ví dụ với mảng A[] = {13, 6, 7, 12}, ta có kết quả là { _ , 7 . 12, 13}.
package SapXepTimKiem;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bai27 {
    public static int bs(int[] a, int n, int x) {
        int l = 0, r = n - 1;
        int res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] > x) {
                res = m;
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
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            int tmp = bs(b, n, a[i]);
            if (tmp != -1) {
                System.out.print(b[tmp] + " ");
            } else {
                System.out.print("_" + " ");
            }
        }
    }
}