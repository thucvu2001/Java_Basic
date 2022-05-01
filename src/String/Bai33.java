package String;

import java.util.Scanner;

public class Bai33 {
    public static boolean thuanNghich(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static boolean chua6(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '6') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (chua6(s) && thuanNghich(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
