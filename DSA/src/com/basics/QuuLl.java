package com.manasa;

import java.util.LinkedList;
import java.util.Queue;

public class QuuLl {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.offer(3); //adds element into queue, return true/false if operation is successful/unsucessful
        q.offer(4);
        q.offer(7);
        System.out.println(q);
        System.out.println(q.poll()); // pops element
        System.out.println(q.peek()); // returns head of queue
        System.out.println(q.contains(4));
        System.out.println(q.isEmpty());
        System.out.println(q);
        q.add(9); //similar to offer but throws exception if operation is unsuccessful
        System.out.println(q.remove()); //similar to poll but throws exception if queue is empty
        System.out.println(q.element()); //similar to peek but throws exception if queue is empty
        System.out.println(q);
    }
}
