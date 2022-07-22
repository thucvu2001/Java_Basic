package StringCoBan;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<String, Integer> mp = new TreeMap<>();
        String[] t = s.split("\\s+");
        for (String x : t) {
            if (mp.containsKey(x)) {
                int fre = mp.get(x);
                mp.put(x, fre + 1);
            } else {
                mp.put(x, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        for (String x : t) {
            if (mp.get(x) != 0) {
                System.out.println(x + " " + mp.get(x));
                mp.put(x, 0);
            }
        }
    }
}
