package String;

import java.io.*;
import java.util.*;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int[] cnt1 = new int[256];
        int[] cnt2 = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            cnt1[s1.charAt(i)] = 1;
        }
        for (int i = 0; i < s2.length(); i++) {
            cnt2[s2.charAt(i)] = 1;
        }
        for (int i = 0; i < 256; i++) {
            if (cnt1[i] == 1 && cnt2[i] == 0) {
                System.out.print((char) (i));
            }
        }
        System.out.println();
        for (int i = 0; i < 256; i++) {
            if (cnt2[i] == 1 && cnt1[i] == 0) {
                System.out.print((char) (i));
            }
        }
    }
}
