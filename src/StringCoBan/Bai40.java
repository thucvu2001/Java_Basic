package StringCoBan;

import java.util.Scanner;

public class Bai40 {
    public static boolean check(String s) {
        long ans = 0;
        long lt = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                ans += lt;
                ans %= 10;
            }
            lt *= 2;
            lt %= 10;
        }
        return ans % 5 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (check(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
