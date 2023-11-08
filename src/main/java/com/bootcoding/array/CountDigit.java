package com.bootcoding.array;
public class CountDigit {
    public static void main(String[] args) {
        int a=236;
        int count=0;
        while (a>0)
        {
            a=a/10;
            count++;
        }
        System.out.println("digit count is:"+count);
    }
}
