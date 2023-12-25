package com.bootcoding.scanner_class;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int digit=0;
        int reverse=0;
        int d=num;


        while(num!=0) {
            digit = num % 10;
            num = num / 10;
            reverse = reverse * 10 + digit;
        }

            if (d==reverse)
            {
                System.out.println("This is palindrome number:");
            }
            else {
                System.out.println("This is not palindrome number:");
            }
        }
    }

