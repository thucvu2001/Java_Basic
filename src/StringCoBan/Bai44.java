package StringCoBan;

import java.util.Scanner;

public class Bai44 {
    public static long du(String s, long k) {
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans = ans * 10 + (s.charAt(i) - '0');
            ans %= k;
        }
        return ans;
    }

    public static long powMod(long a, long b, long c) {
        long ans = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                ans *= a;
                ans %= c;
            }
            a *= a;
            a %= c;
            b /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        long m = sc.nextLong();
        long x = du(n, 1000000007);
        long ans = powMod(x, m, 1000000007) % 1000000007;
        System.out.println(ans);
    }
}
