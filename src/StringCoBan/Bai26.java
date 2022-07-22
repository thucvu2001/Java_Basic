package StringCoBan;

import java.util.Scanner;

public class Bai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + "1";
        Character x = 'a';
        int max_val = Integer.MIN_VALUE;
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
            } else {
                if (cnt > max_val) {
                    max_val = cnt;
                    x = s.charAt(i - 1);
                } else if (cnt == max_val && x < s.charAt(i - 1)) {
                    x = s.charAt(i - 1);
                }
                cnt = 1;
            }
        }
        for (int i = 0; i < max_val; i++) {
            System.out.print(x);
        }
    }
}
