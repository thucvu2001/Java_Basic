// Xâu pangram là xâu có chứa đầy đủ các kí tự từ A tới Z không phân biệt chữ hoa hay thường. Nhập vào xâu S và kiểm tra xem xâu S có phải là xâu pangram hay không?
package String;

import java.util.Locale;
import java.util.Scanner;

public class Bai8 {
    public static boolean check(int[] a, int l, int r) {
        for (int i = l; i <= r; i++) {
            if (a[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = s.toLowerCase(Locale.forLanguageTag(s));
        int[] cnt = new int[256];
        for (int i = 0; i < t.length(); i++) {
            cnt[t.charAt(i)]++;
        }
        if (check(cnt, 97, 122)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
