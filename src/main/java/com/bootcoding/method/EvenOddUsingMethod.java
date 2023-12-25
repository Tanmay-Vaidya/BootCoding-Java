package com.bootcoding.method;
import java.util.Scanner;
public class EvenOddUsingMethod {
    public static int evenodd(int n){
        if (n%2==0)
        {
            System.out.println("These is even number");
        }
        else {
            System.out.println("These is odd number");
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();

        System.out.println(evenodd(num));

    }
}
