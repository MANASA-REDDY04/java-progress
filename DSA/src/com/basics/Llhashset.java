package com.manasa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Llhashset {
    public static void main(String[] args) {
        Set<Integer> ls = new LinkedHashSet<>();
        //unlike hashset it maintains elements in given order
        ls.add(2);
        ls.add(3);
        ls.add(5);
        ls.add(7);
        System.out.println(ls);
        ls.remove(5);
        System.out.println(ls);
    }
}
