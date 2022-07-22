// Cho một xâu kí tự S bao gồm các chữ cái và dấu cách, một từ được định nghĩa là các kí tự liên tiếp không chứa dấu cách, hãy sắp xếp các từ thuận nghịch khác nhau trong xâu theo thứ tự từ chiều dài tăng dần, nếu 2 từ thuận nghịch có cùng chiều dài thì từ nào xuất hiện trước sẽ được in ra trước.
package StringCoBan;

import java.util.*;

public class Bai12 {
    public static boolean thuanNghich(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        String[] a = s.split("\s++");
        Set<String> se = new HashSet<>();
        for (String x : a) {
            if (thuanNghich(x) && !se.contains(x)) {
                arr.add(x);
            }
            se.add(x);
        }
        arr.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len1 = o1.length();
                int len2 = o2.length();
                return len1 - len2;
            }
        });
        for (String x : arr) {
            System.out.print(x + " ");
        }
    }
}
