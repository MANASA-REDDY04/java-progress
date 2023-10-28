package com.manasa;

import java.util.Scanner;

public class Sumxor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum2=0;
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int sum=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum = sum^ (a[i]+a[j]);
                System.out.println(sum);
            }
            sum2 = sum2 ^sum;
        }
    }
}
