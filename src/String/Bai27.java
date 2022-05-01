package String;

import java.util.Scanner;

public class Bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s += "  "; // 2 dau cac de else xay ra
        int idx = 0;
        int max_val = -1;
        int cnt = 1;
        String t;
        String ketQua = "a";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                cnt++;
            } else {
                t = s.substring(idx, i);
                if (cnt > max_val) {
                    max_val = cnt;
                    ketQua = t;
                } else if (cnt == max_val && ketQua.compareTo(t) < 0) {
                    ketQua = t;
                }
                idx = i;
                cnt = 1;
            }
        }
        System.out.println(ketQua);
    }
}
