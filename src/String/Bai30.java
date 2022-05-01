package String;

import java.util.*;

public class Bai30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> list = new ArrayList<>();
        s += "a";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                res += s.charAt(i);
            } else {
                while (res.length() > 1 && res.charAt(0) == '0') {
                    res = res.replaceFirst("0", "");
                }
                if (res.length() != 0) {
                    list.add(res);
                    res = "";
                }
            }
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ba.compareTo(ab);
            }
        });
        for (String x : list) System.out.print(x);
    }
}
