// Bạn được cung cấp một danh sách gồm n số nguyên và nhiệm vụ của bạn là tính số giá trị khác biệt trong danh sách.
package SapXepTimKiem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> se = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            se.add(x);
        }
        System.out.println(se.size());
    }
}
