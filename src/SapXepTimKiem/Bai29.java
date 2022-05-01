// Cho mảng A[] gồm n số nguyên dương. Nhiệm vụ của bạn là hãy sắp xếp lại các phần tử của mảng sao cho A[i] ≥A[i-1] nếu i chẵn, A[i] ≤A[i-1] nếu i lẻ. Ví dụ với mảng A[] = {1, 2, 2, 1} ta được mảng được sắp A[] = { 1, 2, 1, 2}.
package SapXepTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
    }
}
