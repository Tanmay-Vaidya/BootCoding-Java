package com.bootcoding.method;
import java.util.Scanner;
public class SumUsingMethod {
    public static long sum(long k){
        long sum=0;
        long r=0;
        while(k>0){
            r=k%10;
            sum=sum+r;
            k=k/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        long num=sc.nextInt();

        System.out.println("The sum of given number is :"+sum(num));
    }
}
