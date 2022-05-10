package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s += "a";
        ArrayList<String> arr = new ArrayList<>();
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num += s.charAt(i);
            } else {
                while(num.length() > 1 && num.charAt(0) == '0'){ // xoa cac ki tu 0 o dau
                    num = num.replaceFirst("0","");
                }
                arr.add(num);
                num = "";
            }
        }
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len1 = o1.length();
                int len2 = o2.length();
                if (len1 != len2) {
                    return len2 - len1;
                } else {
                    return o2.compareTo(o1); // thu tu tu` dien giam dam 9,8,7,6,...
                }
            }
        });
        System.out.println(arr.get(0));
    }
}
