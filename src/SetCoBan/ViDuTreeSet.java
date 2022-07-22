package SetCoBan;

import java.util.Set;
import java.util.TreeSet;

public class ViDuTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        // lưu trữ phần tử không trùng nhau và luôn có thứ tự tăng dần, nếu là kí tự thì sắp xếp theo thứ tự từ điển tăng dần
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(3);
        set.add(2);
        set.contains(5);
        set.remove(5);
        set.isEmpty();
        set.clear();

    }
}
