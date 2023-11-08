package com.bootcoding.array;
public class Array12 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int Esum=0;
        int Osum=0;

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                Esum=arr[i]+Esum;
            }
            else {
                Osum=arr[i]+Osum;
            }
        }
        System.out.println("This is Even Number Addition:"+Esum);
        System.out.println("This is Odd Number Addition:"+Osum);
    }
}

