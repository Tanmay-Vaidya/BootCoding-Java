package com.bootcoding.array;
import java.util.Scanner;
public class ContainsElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array value:");
        int n=sc.nextInt();
        int arr[]={22,13,46,34,67};
        for (int i=0;i<arr.length;i++)
        {
            if(n==arr[i])
            {
                System.out.println("These is array element");
            }
        }
    }
}

