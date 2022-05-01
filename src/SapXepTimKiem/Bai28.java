// Cho mảng A[] gồm n phần tử. Nhiệm vụ của bạn là hãy sắp đặt lại các phần tử của mảng sao cho các số 0 để ở cuối cùng, các phần tử khác 0 được bảo toàn thứ tự trước sau. Ví dụ với mảng A[] = {1, 2, 0, 0, 0, 3, 6} ta có kết quả A[] = {1, 2, 3, 6, 0, 0, 0}.
package SapXepTimKiem;

import java.util.Scanner;

public class Bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int dem0 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                dem0++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                System.out.print(a[i] + " ");
            }
        }
        for (int i = 0; i < dem0; i++) {
            System.out.print("0" + " ");
        }
    }
}
