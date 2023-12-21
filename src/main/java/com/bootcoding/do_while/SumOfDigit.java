package com.bootcoding.do_while;

public class SumOfDigit {
    public static void main(String[] args) {

        int n=1234;
        int sum = 0;
        int r = 0;

        do {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        } while (n > 0);
        System.out.println("Sum of given n is :"+sum);
    }
}