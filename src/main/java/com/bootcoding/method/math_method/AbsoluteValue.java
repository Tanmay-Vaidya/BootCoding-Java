package com.bootcoding.method.math_method;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        System.out.println("The absolute value is:"+Math.abs(a));
    }

}
