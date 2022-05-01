package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String uv = o1 + o2;
                String vu = o2 + o1;
                return vu.compareTo(uv);
            }
        });
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
