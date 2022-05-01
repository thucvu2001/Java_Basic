package String;

import java.util.*;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().toLowerCase();
            String[] a = s.split("\\s+");
            int n = a.length;
            System.out.print(a[a.length - 2]);
            for (int i = 0; i < a.length - 2; i++) {
                System.out.print(a[i].charAt(0));
            }
            System.out.print("@xyz.edu.vn");
            System.out.println();
            String ns = a[n-1];
            StringTokenizer st = new StringTokenizer(ns, "/");
            while(st.hasMoreTokens()){
                int x = Integer.parseInt(st.nextToken());
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
