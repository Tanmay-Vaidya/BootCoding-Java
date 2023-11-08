package com.bootcoding.array;
import java.util.Scanner;
public class CountDigit1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Digit:");
        int a=sc.nextInt();
        int count=0;
        while(a>0)
        {
            a=a/10;
            count++;
        }
        System.out.println("Digit count is:"+count);
    }
}
