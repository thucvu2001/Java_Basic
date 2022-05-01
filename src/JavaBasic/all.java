package JavaBasic;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class all {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> se = new TreeSet<>();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            se.add(a[i]);
        }
        System.out.println(se);
    }
}
