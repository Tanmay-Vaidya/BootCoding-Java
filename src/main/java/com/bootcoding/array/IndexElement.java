package com.bootcoding.array;
import java.util.Scanner;
public class IndexElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Index Value:");
        int a=sc.nextInt();
        int arr[]={12,3,4,56,76};

        for(int i=0;i<arr.length;i++)
        {
            if (a==i)
            {
                System.out.println(" These is Index Value of array:"+arr[i]);
            }
        }
    }
}
