package com.manasa;

import java.util.Set;
import java.util.TreeSet;

public class Tree_set {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        //Implements Binary search tree
        ts.add(2);
        ts.add(5);
        ts.add(77);
        ts.add(12);
        System.out.println(ts);
        ts.remove(5);
        System.out.println(ts);
    }
}
