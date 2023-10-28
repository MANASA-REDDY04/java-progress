package com.manasa;

import java.util.Stack;

public class Stk {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(5);
        s.push(7);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}
