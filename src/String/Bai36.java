package String;

import java.util.Scanner;

public class Bai36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() == 1) {
            if ((s.charAt(0) - '0') % 4 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            int tmp = 0;
            tmp = (s.charAt(s.length() - 2) - '0') * 10 + (s.charAt(s.length() - 1));
            if (tmp % 4 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
