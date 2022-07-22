package QueueCoBan;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViDuDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(5);
        deque.offerLast(6);
        deque.offer(4); // tuong tu offerLast
        deque.size();
        deque.peek();
        deque.poll();
        deque.pollFirst();
        deque.pollLast();
        deque.peekFirst();
        deque.peekLast();

    }
}
