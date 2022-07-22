// Cho một xâu kí tự, hãy đếm tần suất xuất hiện của các kí tự trong xâu và in ra theo yêu cầu.
package StringCoBan;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cnt = new int[256];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (cnt[i] != 0) {
                System.out.println((char) (i) + " " + cnt[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            if (cnt[s.charAt(i)] != 0) {
                System.out.println(s.charAt(i) + " " + cnt[s.charAt(i)]);
                cnt[s.charAt(i)] = 0;
            }
        }
    }
}
