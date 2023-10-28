package com.manasa;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String sentence = sc.nextLine();
            boolean ans = false;
            if(sentence.length()<26)
                ans = false;
            else{
                char[] arr =sentence.toCharArray();
                Arrays.sort(arr);
                int count=0;
                int j=0;
                System.out.println(Arrays.toString(arr));
                for(char i='a';i<='z'&&j<arr.length;i++){
                    while(arr[j]<i&&j< arr.length-1)
                        j++;
                    System.out.print(j+" ");
                    if(arr[j]==i)
                        count++;
                }
                System.out.print("\n count = "+count);
                if(count==26)
                    ans = true;
            }
        System.out.println(ans);
        }
    }

