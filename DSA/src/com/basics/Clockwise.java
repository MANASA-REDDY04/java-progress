package com.manasa;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Clockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayDeque <Integer> a = new ArrayDeque<>(n);
            for(int i=0;i<n;i++){
                int ele = sc.nextInt();;
                a.offer(ele);
            }
            k = k%n;
            System.out.println("K = "+k);
            while (k!=0){
                int ele = a.pollLast();
                a.offerFirst(ele);
                k--;
            }
            for (int i=0;i<n;i++){
                System.out.print(a.peek()+" ");
                a.poll();
            }
        }
    }
}
