package com.bootcoding.array;
import java.util.Scanner;
public class MultiplicationEvenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int a = 10;
        int m;
        for (int i = 1; i <= a; i++) {
            m = n * i;
            if (m%2==0) {
                System.out.println("These is Even Number Multiplication:"+n+"*"+i+"="+m);
            }
            else {
                System.out.println("These is Odd Number Multiplication:" +n+"*"+i+"="+m);
            }
        }

    }
}



