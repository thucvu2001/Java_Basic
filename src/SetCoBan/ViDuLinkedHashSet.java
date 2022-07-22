package SetCoBan;

import java.util.LinkedHashSet;
import java.util.Set;

public class ViDuLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>(); // lưu trữ phần tử không trùng nhau, và lưu lại thứ tự phần tử thêm vào, HashSet không có thứ tự
        set.add(5);
        set.add(6);
        set.add(7);
        set.size();
        set.contains(5);
        set.remove(5);
        set.clear();
        set.isEmpty();
    }
}
