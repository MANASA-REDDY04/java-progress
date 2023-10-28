package com.manasa;

import java.util.Arrays;

public class Arrclass {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7};
        int index = Arrays.binarySearch(a,4);
        System.out.println(index);
        int[] b = {1,5,3,7,9,22,54,73};
        System.out.println("before sort: ");
        for (int i: b) {
            System.out.print(i+" ");
        }
        Arrays.sort(b);
        System.out.println("\nafter sort: ");
        for (int i: b) {
            System.out.print(i+" ");
        }
        Arrays.fill(b,0);
        System.out.println();
        for (int i: b) {
            System.out.print(i+" ");
        }
    }
}
