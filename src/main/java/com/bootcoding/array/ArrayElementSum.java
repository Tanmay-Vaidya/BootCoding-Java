package com.bootcoding.array;
public class ArrayElementSum {
    public static void main(String[]args){
        int arr[]={4,6,9,20};
        int Sum=0;
        for(int i=0;i<4;i++)
        {
            Sum=arr[i]+Sum;
        }
        System.out.println(Sum);
    }
}
