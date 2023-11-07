package com.bootcoding.array;

public class Array10 {
    public static void main(String[] args) {
        int arr[]={5,10,15,20,25};
        int Sub=0;
        for(int i=0;i<5;i++)
        {
            Sub=arr[i]-Sub;
        }
        System.out.println(Sub);
    }
}
