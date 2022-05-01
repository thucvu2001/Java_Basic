package String;

import java.util.Scanner;

public class Bai35 {
    public static boolean chia2(String s) {
        char x = s.charAt(s.length() - 1);
        return x == '0' || x == '2' || x == '4' || x == '6' || x == '8';
    }

    public static boolean chia3(String t) {
        long s = 0;
        for (int i = 0; i < t.length(); i++) {
            s += t.charAt(i) - '0';
        }
        return s % 3 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (chia2(s) && chia3(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
