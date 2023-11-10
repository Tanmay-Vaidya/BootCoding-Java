package com.bootcoding.array;

public class SmallestNumber {
    public static void main(String[] args) {
        int arr[]={11,8,15,9,16};
        int a=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]<a)
            {
                a=arr[i];
            }
        }
        System.out.println(a);
    }
}
