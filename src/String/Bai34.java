package String;

import java.util.Scanner;

public class Bai34 {
    public static boolean tang(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean giam(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (tang(s) || giam(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
