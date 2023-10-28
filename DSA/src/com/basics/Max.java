package com.manasa;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)
            System.out.println("max = "+a);
        else
            System.out.println("max = "+b);
    }
}
