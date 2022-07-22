package StringCoBan;

import java.util.Scanner;

public class Bai38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() == 1) {
            if (s.charAt(0) == '0') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            int ans = 0;
            ans = (s.charAt(s.length() - 2) - '0') * 10 + (s.charAt(s.length() - 1) - '0');
            if (ans % 25 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
