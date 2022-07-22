//Cho một xâu kí tự S bao gồm các chữ cái và dấu cách, một từ được định nghĩa là các kí tự liên tiếp không chứa dấu cách, hãy liệt kê các từ khác nhau trong xâu S, đầu tiên hãy liệt kê các từ khác nhau theo thứ tự từ điển tăng dần, sau đó liệt kê các từ theo thứ tự xuất hiện trong xâu.
package StringCoBan;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<String> se = new TreeSet<>();
        Set<String> se2 = new LinkedHashSet<>();
        String[] arr = s.split("\\s+");
        for (String x : arr) {
            se.add(x);
            se2.add(x);
        }
        for (String x : se) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (String x : se2) {
            System.out.print(x + " ");
        }
    }
}
