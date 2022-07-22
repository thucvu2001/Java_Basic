package QueueCoBan;

import java.util.*;

public class ViDuQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(10);
        queue.offer(12);
        queue.poll(); // lấy ra và xoá;
        queue.peek(); // lấy ra nhưng không xoá
        queue.isEmpty(); // kiểm tra rỗng => true/false
        queue.remove(5); // xoá phần tử trong ngoặc
        queue.clear(); // xoá toàn bộ phần tử

    }
}
