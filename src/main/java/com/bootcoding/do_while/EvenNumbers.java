package com.bootcoding.do_while;

public class EvenNumbers {
    public static void main(String[] args) {
        int i = 2;

        do {
            if (i % 2 == 0) {
                System.out.println("Even number is :" + i);
                i=i+2;
            }
        }
        while (i <= 20);
    }
}

