package com.manasa;

import java.util.Scanner;

public class RupToDol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rupees = sc.nextInt();
        System.out.println(rupees*0.012+"$");
    }
}
