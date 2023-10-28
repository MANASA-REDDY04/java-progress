package com.manasa;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class ListLl {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1,50);
        System.out.println(list.contains(50));
        System.out.println(list.contains(22));
        list.add(3);
        list.add(4);
        Iterator<Integer> i = list.iterator();
        while ((i.hasNext())){
            System.out.print(i.next()+" ");
        }
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(5));
        System.out.println(list);
    }
}
