package com.manasa;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p = sc.nextInt();
        float t = sc.nextInt();
        float r = sc.nextInt();
        System.out.println("SI = "+(p*t*r)/100);
    }
}
