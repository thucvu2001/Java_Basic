package StackCoBan;

import java.util.Stack;

public class ViDuStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(4);
        stack.push(10);
        stack.push(15);
        stack.peek();
        stack.size();
        stack.contains(5);
        stack.pop();
        stack.search(15);
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());
        stack.clear();
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());
    }
}
