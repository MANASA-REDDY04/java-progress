package com.manasa;

import java.util.ArrayDeque;

public class Array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.offer(2);
        a.offerFirst(3);
        a.offerLast(8);
        a.offerFirst(1);
        System.out.println(a);
        System.out.println(a.poll());
        System.out.println(a.pollLast());
        System.out.println(a.peek());
        System.out.println(a.peekLast());
//        System.out.println(a.peekFirst());
//        System.out.println(a.pollFirst());
        System.out.println(a);
    }
}
