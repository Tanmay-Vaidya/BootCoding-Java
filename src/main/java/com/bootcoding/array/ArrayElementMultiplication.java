package com.bootcoding.array;

public class ArrayElementMultiplication {
    public static void main(String[] args) {
        int arr[]={5,8,4,7,2,5,7};
        int Multi=1;
        for(int i=0;i< arr.length;i++)
        {
            Multi = arr[i] * Multi;
        }
        System.out.println(Multi);
    }
}
