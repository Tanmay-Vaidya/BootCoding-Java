package com.bootcoding.array;

public class LargestNumber{
    public static void main(String[] args) {
        int arr[]={24,36,48,19,78};
        int a=0;
        for(int i=0;i< arr.length;i++)
        {
            if(a<arr[i])
            {
                a=arr[i];
            }
        }
        System.out.println("The Largest Number is:" +a);
    }
}
