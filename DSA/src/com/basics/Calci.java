package com.manasa;

import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Operands: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Enter Operator +,-,* or / :");
        char opr = sc.next().charAt(0);
        if(opr == '+')
            System.out.println(a+b);
        else if(opr == '-')
            System.out.println(a-b);
        else if(opr == '*')
            System.out.println(a*b);
        else
            System.out.println(a/b);
    }
}
