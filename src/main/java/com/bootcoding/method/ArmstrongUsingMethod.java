package com.bootcoding.method;
import java.util.Scanner;
public class ArmstrongUsingMethod {
    public static int armstrong(int n){
        int arm=0, a , b;
            b=n;
        while (n > 0) {
            a = n % 10;
            arm = (a * a * a ) + arm;
            n = n / 10;
        }
            if (b==arm) {
                System.out.println("These number is armstrong Number:");
            } else {
                System.out.println("These number is Not armstrong Number:");
            }
        return arm;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();

        System.out.println(armstrong(num));
    }
}
