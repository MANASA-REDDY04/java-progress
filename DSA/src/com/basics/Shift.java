package com.manasa;
import java.io.*;
import java.util.*;

public class Shift {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            k = k%n;
            int[] a = new int[n];
            shift(a,n,k);
            print(a,n);
        }
    }
    static void shift(int[] a,int n,int k){
        int[] temp = new int[k];
        int j=0;
        for(int i=n-k;i<n;i++){
            temp[j] = a[i];
            j++;
        }
        for(int i=n-1;i>=k;i--){
            a[i]=a[i-k];
        }
        for(int i=0;i<k;i++){
            a[i] = temp[i];
              System.out.print(temp[i]+" ");
            System.out.println();
        }
    }
    static void print(int[] a,int n){
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}