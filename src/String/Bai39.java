package String;

import java.util.Scanner;

public class Bai39 {
    public static boolean check(String s) {
        long ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            ans = ans * 10 + (s.charAt(i) - '0');
            ans %= 11;
        }
        return ans == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (check(s)) {
            System.out.println("YES");
        } else {
            System.out.printf("NO");
        }
    }
}
