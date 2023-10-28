package com.manasa;

import java.util.Map;
import java.util.TreeMap;

public class Tmap {
    public static void main(String[] args) {
        Map<Integer,String> numbers = new TreeMap<>();
        // Implements BST, stores in sorted order
        numbers.put(1,"one");
        numbers.put(0,"Zero");
        numbers.put(3,"three");
        numbers.put(4,"four");
        numbers.put(5,"five");
        System.out.println(numbers.containsKey(1));
        System.out.println(numbers.containsValue("six"));
        numbers.putIfAbsent(3,"3");
        numbers.putIfAbsent(6,"six");
        // Iteration
        for(Map.Entry<Integer,String> e: numbers.entrySet()) {
            System.out.println(e);
        }
        //getting each value
        for(Map.Entry<Integer,String> e: numbers.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        //keyset
        for(Integer key: numbers.keySet())
            System.out.println(key);
        //valueset
        for (String value: numbers.values()) {
            System.out.println(value);
        }
        numbers.remove(2);
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());
    }
}
