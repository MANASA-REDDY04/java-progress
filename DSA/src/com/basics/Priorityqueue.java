package com.manasa;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {
    public static void main(String[] args) {
//        Queue<Integer> pq = new PriorityQueue<>(); //stores elements in form of min heap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // converts to max heap
        pq.offer(2);
        pq.offer(4);
        pq.offer(23);
        pq.offer(54);
        pq.offer(1);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
