package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = Integer.parseInt(sc.nextLine());
        Map<String, Integer> map = new HashMap<>();
        while (TC-- > 0) {
            String s = sc.nextLine().toLowerCase();
            String[] a = s.split("\\s+");
            int n = a.length;
            String name = "";
            name += a[n - 2];
            for (int i = 0; i < n - 2; i++) {
                name += a[i].charAt(0);
            }
            if (map.containsKey(name)) {
                System.out.print(name + "" + (map.get(name) + 1));
                int fre = map.get(name);
                fre++;
                map.put(name, fre);
            } else {
                System.out.print(name);
                map.put(name, 1);
            }
            System.out.print("@xyz.edu.vn");
            System.out.println();
            String ns = a[n - 1];
            StringTokenizer st = new StringTokenizer(ns, "/");
            while(st.hasMoreTokens()){
                int x = Integer.parseInt(st.nextToken());
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
