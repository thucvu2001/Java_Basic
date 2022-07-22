// Cho một xâu kí tự S bao gồm các chữ cái và dấu cách, một từ được định nghĩa là các kí tự liên tiếp không chứa dấu cách. Hãy tìm từ có số lần xuất hiện nhiều nhất và ít nhất trong xâu, nếu có nhiều từ có cùng số lần xuất hiện nhiều nhất hoặc ít nhất thì chọn từ có thứ tự từ điển lớn nhất làm kết quả.
package StringCoBan;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split("\\s+");
        Map<String, Integer> mp = new TreeMap<>();
        for(String x : a){
            if(mp.containsKey(x)){
                int fre = mp.get(x);
                mp.put(x, fre + 1);
            } else {
                mp.put(x,1);
            }
        }
        String min = "", max = "";
        int min_val = Integer.MAX_VALUE, max_val = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : mp.entrySet()){
            if(entry.getValue() >= max_val){
                max = entry.getKey();
                max_val = entry.getValue();
            }
            if(entry.getValue() <= min_val){
                min = entry.getKey();
                min_val = entry.getValue();
            }
        }
        System.out.println(max + " " + max_val);
        System.out.println(min + " " + min_val);
    }
}
