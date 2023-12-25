package com.bootcoding.scanner_class;
import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println("Enter factorial number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        int fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial is:"+fact);
    }
}
