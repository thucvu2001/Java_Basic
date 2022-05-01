// Cho 2 xâu kí tự S1 và S2 chỉ bao gồm chữ cái in hoa và in thường, hãy tìm các kí tự xuất hiện trong xâu S1 mà không xuất hiện trong xâu S2, và các kí tự chỉ xuất hiện trong xâu S2 mà không xuất hiện trong xâu S1. Các ký tự được in ra theo thứ tự từ điển và chỉ liệt kê mỗi ký tự một lần.
package String;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cnt = new int[256];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i)]++;
        }
        int idx_max = 0, idx_min = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (cnt[i] >= max) {
                max = cnt[i];
                idx_max = i;
            }
            if (cnt[i] <= min && cnt[i] > 0) {
                min = cnt[i];
                idx_min = i;
            }
        }
        System.out.println((char) (idx_max) + " " + max);
        System.out.println((char) (idx_min) + " " + min);
    }
}
