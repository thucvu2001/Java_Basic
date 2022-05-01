package String;

import java.util.Scanner;

public class Bai42 {
    public static long check(String s, long k) {
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans = ans * 10 + (s.charAt(i) - '0');
            ans %= k;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long k = sc.nextLong();
        System.out.println(check(s, k));
    }
}
