package com.bootcoding.array;
import java.util.Scanner;
public class PalindromeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a = sc.nextInt();
        int digit= 0;
        int reverse = 0, d = a;
        while (a!=0) { //12
            digit = a % 10; //121-->1 , 2
            a = a / 10;//12 1
            reverse = reverse * 10 + digit;//1  2
        }
            if (d==reverse) {
                System.out.println("These is palindrome Number");
            } else {
                System.out.println("These is Not Palindrome Number");
            }

    }
}
