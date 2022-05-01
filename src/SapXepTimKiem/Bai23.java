//Cho mảng A[] gồm n phần tử. Bạn hãy thực hiện làm các công việc sau đây :
// + Sắp xếp các phần tử trong mảng theo tần suất giảm dần, nếu 2 số có cùng tần suất thì số nào nhỏ hơn sẽ in ra trước.
// + Sắp xếp các phần tử trong mảng theo tần suất giảm dần, nếu 2 số có cùng tần suất thì số nào xuất hiện trước sẽ in ra trước.
package SapXepTimKiem;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (mp.containsKey(x)) {
                int fre = mp.get(x);
                fre++;
                mp.put(x, fre);
            } else {
                mp.put(x, 1);
            }
        }
        ArrayList<Map.Entry<Integer, Integer>> list1 = new ArrayList<>();
        ArrayList<Map.Entry<Integer, Integer>> list2 = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            list1.add(entry);
            list2.add(entry);
        }
        Collections.sort(list1, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() != o2.getValue()) {
                    return o2.getValue() - o1.getValue();
                } else {
                    return o1.getKey() - o2.getKey();
                }
            }
        });
        Collections.sort(list2, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        for (Map.Entry<Integer, Integer> entry : list1) {
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
        for (Map.Entry<Integer, Integer> entry : list2) {
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
