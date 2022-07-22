package StringCoBan;

import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + "a";
        long res = 0, tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                tmp = tmp * 10 + (s.charAt(i) - '0');
            } else {
                res += tmp;
                tmp = 0;
            }
        }
        System.out.println(res);
    }
}

