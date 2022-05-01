package String;

import java.util.Scanner;

public class Bai31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                ans += (s.charAt(i) - '0');
            }
        }
        System.out.println(ans);
    }
}
