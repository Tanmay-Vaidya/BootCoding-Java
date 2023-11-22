package com.bootcoding.array;

public class ArrayMinimumElement {
    public static void main(String[] args) {
        int arr[]={9,54,6,74,12};
        int c=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]<c)
            {
                c=arr[i];
            }
        }
        System.out.println("The Minimum Number is :"+c);
    }
}
