package MapCoBan;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViDuHashMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>(); // Map lưu các cặp (key, value), các key không trùng nhau và HashMap không có thứ tự
        map.put(100, 200); // (key, value)
        map.put(300, 400);
        map.put(600, 500);
        map.containsKey(100); // tim kiem key 100
        map.containsValue(400); // tim kiem value 400
        map.remove(100);
        map.remove(300, 400);
        map.get(100); // = 200

        // Duyệt map
        // Cach 1
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        // Cach 2
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
