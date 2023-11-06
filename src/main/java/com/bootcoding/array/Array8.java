package com.bootcoding.array;
import java.util.Scanner;
public class Array8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=sc.nextInt();
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int p;
        for(int i=0;i<arr.length;i++)
        {
            p=n*arr[i];
            System.out.println(n+"*"+arr[i]+"="+p);
        }
    }
}