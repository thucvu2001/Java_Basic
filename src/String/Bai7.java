package String;
import java.io.*;
import java.util.*;
public class Bai7 {
    public static boolean check(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++; r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(check(s)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
