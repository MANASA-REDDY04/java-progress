package com.manasa;

import java.util.HashSet;
import java.util.Set;

public class Hash_set {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        /* set does not consider duplicate elements
        Elements are printed in random order based on hash key values
         */
        hs.add(2);
        hs.add(7);
        hs.add(1);
        hs.add(54);
        System.out.println(hs);
        hs.remove(7);
        System.out.println(hs);
    }
}
