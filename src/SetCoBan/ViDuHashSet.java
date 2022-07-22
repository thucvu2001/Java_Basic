package SetCoBan;

import java.util.HashSet;
import java.util.Set;

public class ViDuHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // lưu trữ các phần tử không trùng nhau và không có thứ tự
        set.add(4);
        set.add(5);
        set.add(6);
        set.size();
        set.contains(5);
        set.remove(5);
        set.clear();
        set.isEmpty();
    }
}
