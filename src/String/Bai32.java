package String;

import java.util.Scanner;

public class Bai32 {
    public static boolean check(long n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean check2(String s) {
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x != '2' && x != '3' && x != '5' && x != '7') {
                return false;
            }
            ans += (x - '0');
        }
        return check(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (check2(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
