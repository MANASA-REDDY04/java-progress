package com.manasa;

import java.util.Scanner;

public class Hollowdiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<=i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int j=0;j<n;j++){
                if(j<n-i-1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        n--;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int j=0;j<n;j++){
                if(j<i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
