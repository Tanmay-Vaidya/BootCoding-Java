package com.bootcoding.method.math_method;
import java.util.Scanner;
public class MaxFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number:");
        int a=sc.nextInt();
        System.out.println("Enter a second number:");
        int b= sc.nextInt();
        System.out.println("The maximum number is:"+Math.max(a,b));
    }
}
