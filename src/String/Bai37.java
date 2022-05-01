package String;

import java.util.Scanner;

public class Bai37 {
    public static boolean check5(String s) {
        return s.charAt(s.length() - 1) == '0' || s.charAt(s.length() - 1) == '5';
    }

    public static boolean check3(String s) {
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += (s.charAt(i) - '0');
        }
        return ans % 3 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (check5(s) && check3(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
