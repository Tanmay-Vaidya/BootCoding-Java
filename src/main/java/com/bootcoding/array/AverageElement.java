package com.bootcoding.array;

public class AverageElement {
    public static void main(String[] args) {
    int arr[]={11,22,33,44,55};
    int sum=0;
    double avg=0;
    for(int i=0;i< arr.length;i++)
    {
        sum=sum+arr[i];
    }
        System.out.println("The total sum is:"+sum);
        avg=sum/arr.length;
        System.out.println("The Average is:"+avg);
    }
}

