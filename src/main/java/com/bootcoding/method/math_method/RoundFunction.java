package com.bootcoding.method.math_method;
import java.util.Scanner;
public class RoundFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        double b=sc.nextDouble();
        System.out.println(Math.round(b));
    }
}
