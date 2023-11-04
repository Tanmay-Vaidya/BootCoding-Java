package com.bootcoding.array;
public class Example6 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=i*4;
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
