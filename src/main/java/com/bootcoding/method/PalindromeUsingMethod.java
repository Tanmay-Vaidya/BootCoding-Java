package com.bootcoding.method;

import java.util.Scanner;
public class PalindromeUsingMethod {
    public static int palindrome(int n) {
        int digit = 0;
        int reverse = 0;
        int d = n;
        while (n != 0) {
            digit = n % 10;
            n = n / 10;
            reverse = reverse * 10 + digit;
        }
        if (d == reverse) {
                System.out.println("This number is palindrome number");
            } else {
                System.out.println("This number is not palindrome number");
            }
        return reverse;

        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number:");
            int num= sc.nextInt();


            System.out.println(palindrome(num));
        }
    }
























