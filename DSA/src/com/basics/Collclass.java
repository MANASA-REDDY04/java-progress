package com.manasa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collclass {
    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(7);
        a.add(9);
        a.add(54);
        a.add(54);
        a.add(36);
        a.add(54);
        System.out.println("min: "+ Collections.min(a));
        System.out.println("max: "+ Collections.max(a));
        System.out.println("frequency: "+Collections.frequency(a,54));
        Collections.sort(a);
        System.out.println("sort: ");
        System.out.println(a);
    }
}
