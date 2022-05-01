package HuongDoiTuongPhan1;

import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set;

    public WordSet(TreeSet<String> set) {
        this.set = set;
    }

    public WordSet(String s) {
        this.set = new TreeSet<>();
        String[] arr = s.split("\\s+");
        for (String x : arr) {
            this.set.add(x);
        }
    }

    public WordSet union(WordSet another) {
        WordSet res = new WordSet(" ");
        for (String x : another.set) {
            res.set.add(x);
        }
        for (String x : this.set) {
            res.set.add(x);
        }
        return res;
    }

    public WordSet intersection(WordSet another) {
        WordSet res = new WordSet(" ");
        for (String x : another.set) {
            if (this.set.contains(x)) {
                res.set.add(x);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        for (String x : this.set) {
            res += x;
            res += " ";
        }
        if (res.equals("") == false) {
            return res;
        }
        StringBuilder sb = new StringBuilder(res);
        if (sb.equals("") == false) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordSet s1 = new WordSet(sc.nextLine());
        WordSet s2 = new WordSet(sc.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
