package com.bootcoding.array;
public class ReverseNumber {
    public static void main(String[] args) {
        int a=124;
        int digit=0;
        int reverse=0;

        while(a!=0)
        {
            digit=a%10;
            a=a/10;
            reverse=reverse*10+digit;
        }
        System.out.println(reverse);
    }
}