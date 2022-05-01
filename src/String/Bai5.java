// Cho 2 xâu kí tự S1 và S2, hãy in ra các kí tự xuất hiện ở cả 2 xâu theo thứ tự từ điển, chú ý mỗi kí tự chỉ liệt kê một lần. Sau đó tiếp tục liệt kê các kí tự xuất hiện ở 1 trong 2 xâu theo thứ tự từ điển.

package String;

import java.util.*;
import java.io.*;

public class    Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int[] cnt1 = new int[256];
        int[] cnt2 = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            cnt1[s1.charAt(i)] = 1;
            cnt2[s1.charAt(i)] = 1;
        }
        for (int i = 0; i < s2.length(); i++) {
            cnt2[s2.charAt(i)] = 1;
            if (cnt1[s2.charAt(i)] == 1) { // kiem tra ki tu nay da xuat hien o xau kia chua
                cnt1[s2.charAt(i)] = 2;
            }
        }
        for (int i = 0; i < 256; i++) {
            if (cnt1[i] == 2) {
                System.out.print((char) (i));
            }
        }
        System.out.println();
        for (int i = 0; i < 256; i++) {
            if (cnt2[i] != 0) {
                System.out.print((char) (i));
            }
        }
    }
}
