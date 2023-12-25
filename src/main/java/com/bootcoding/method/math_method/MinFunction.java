package com.bootcoding.method.math_method;
import java.util.Scanner;
public class MinFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number:");
        int j=sc.nextInt();
        System.out.println("Enter a second number:");
        int k=sc.nextInt();
        System.out.println("The minimum number is:"+Math.min(j,k));
    }
}
