package com.bootcoding.method.math_method;
import java.util.Scanner;
public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        double x=sc.nextDouble();
        System.out.println("Enter second number:");
        double z=sc.nextDouble();
        System.out.println("Power is:"+Math.pow(x,z));
    }
}
