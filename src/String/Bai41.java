// so nhi phan chia het cho 2^x thi x bit cuoi phai = 0;
package String;

import java.util.Scanner;

public class Bai41 {
    public static boolean check(String s, int k) {
        for (int i = s.length() - 1; i >= s.length() - k; i--) {
            if (s.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        if (check(s, k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
