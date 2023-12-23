package com.bootcoding.method;
import java.util.Scanner;
public class FactorialUsingMethod {
    public static int factorial(int n)
    {
        int fact = 1, i;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();

        System.out.println("Factorial is :" +factorial(num));


    }

}
