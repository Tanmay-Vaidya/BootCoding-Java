package com.bootcoding.method;
import java.util.Scanner;
public class PrimeNumberUsingMethod {

    public static int prime(int z) {
        int count = 0;
        for (int k = 1; k <= z; k++) {
            if (z % k == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It is prime number:");
        } else {
            System.out.println("It is not prime number");
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();

        System.out.println(prime(num));
    }
}




