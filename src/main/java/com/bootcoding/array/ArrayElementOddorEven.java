package com.bootcoding.array;
public class ArrayElementOddorEven {
    public static void main(String[] args) {
        int arr[]={4,43,6,2,35,3,9,8,45,9,32};
        for(int i=0;i<11;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("These is even Number:"+arr[i]);
            }
            else{
                System.out.println("These is odd Number:"+arr[i]);
            }
        }
    }
}
