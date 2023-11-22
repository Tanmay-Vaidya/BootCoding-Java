package com.bootcoding.array;

public class ArrayMaximumElement {
    public static void main(String[] args) {
        int arr[]={12,34,56,23,10};
        int c=0;
        for (int i=0;i< arr.length;i++)
        {
            if(c<arr[i])
            {
                c=arr[i];
            }
        }
        System.out.println("The Maximum Number is:"+c);
    }
}
