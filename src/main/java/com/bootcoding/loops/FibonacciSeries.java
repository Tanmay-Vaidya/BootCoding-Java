package com.bootcoding.loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0,b=1,c;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter term:");
        int num=sc.nextInt();

        for (int k=0 ; k<=num ; k++ ){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;

        }

    }
}
