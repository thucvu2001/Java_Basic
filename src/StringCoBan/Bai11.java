package StringCoBan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        String[] a = s.split("\\s+");
        for (String x : a) {
            arr.add(x);
            arr2.add(x);
        }
        arr.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        arr2.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len1 = o1.length();
                int len2 = o2.length();
                if (len1 != len2) {
                    return len1 - len2;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        for (String x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (String x : arr2) {
            System.out.print(x + " ");
        }
    }
}
