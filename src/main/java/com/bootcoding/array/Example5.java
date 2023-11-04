package com.bootcoding.array;
public class Example5 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i*3;
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
