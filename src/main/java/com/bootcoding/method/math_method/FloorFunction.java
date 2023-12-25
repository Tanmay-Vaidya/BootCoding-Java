package com.bootcoding.method.math_method;
import java.util.Scanner;
public class FloorFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        double m=sc.nextDouble();
        System.out.println(Math.floor(m));
    }
}
