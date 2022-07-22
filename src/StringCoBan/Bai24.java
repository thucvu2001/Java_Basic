package StringCoBan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        long cnt = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int fre = map.get(s.charAt(i));
                fre++;
                map.put(s.charAt(i), fre);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() >= 2) {
                cnt += ((long) entry.getValue() * (entry.getValue() - 1)) / 2;
            }
        }
        System.out.println(cnt);
    }
}
