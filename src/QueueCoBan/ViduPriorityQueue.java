package QueueCoBan;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ViduPriorityQueue {

    public static void main(String[] args) {
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // min heap: phan tu o dau luon nho nhat
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(cmp); // max heap: phan tu o dau luon lon nhat
        priorityQueue.add(5);
        priorityQueue.offer(6);
        priorityQueue.peek();
        priorityQueue.poll();
        priorityQueue.remove(5);
        priorityQueue.size();
    }
}
