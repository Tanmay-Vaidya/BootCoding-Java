package com.bootcoding.method.math_method;
import java.util.Scanner;
public class SquareRootFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        double square=sc.nextDouble();
        System.out.println(Math.sqrt(square));
    }
}
