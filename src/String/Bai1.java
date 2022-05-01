// Cho một xâu kí tự, hay đếm số lượng kí tự là chữ cái, chữ số và kí tự đặc biệt(Các kí tự không phải là chữ cái và chữ số).
package String;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int dem1 = 0, dem2 = 0, dem3 = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                dem1++;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                dem2++;
            } else {
                dem3++;
            }
        }
        System.out.println(dem1 + " " + dem2 + " " + dem3);
    }
}
