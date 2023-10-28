package com.manasa;

import java.util.Scanner;

import static java.lang.Math.pow;

//Armstrong between two given numbers
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        //armstrong no's between start and end (exclude start and end)
        for(int i=start+1;i<end;i++){
            int temp1=i;
            int c=0;
            while(temp1!=0){
                c++;
                temp1/=10;
            }
            int digit,sum=0,temp2=i;
            while (temp2!=0){
                digit=temp2%10;
                sum += pow(digit,c);
                temp2/=10;
            }
            if(sum==i)
                System.out.print(sum+" ");
        }
    }
}
