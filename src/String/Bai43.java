package String;

import java.util.Scanner;

public class Bai43 {
    public static long check(String s, long k) {
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans = ans * 10 + (s.charAt(i) - '0');
            ans %= k;
        }
        return ans;
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        long m = sc.nextLong();
        long du = check(n, m);
        System.out.println(gcd(du, m));
    }
}
