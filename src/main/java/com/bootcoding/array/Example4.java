package com.bootcoding.array;
public class Example4 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i*2;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
