package com.manasa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=2;
        while(c*c<=n){
            if(n%c==0) {
                System.out.println("Non Prime");
                return;
            }
            c++;
        }
        System.out.println("Prime");
    }
}