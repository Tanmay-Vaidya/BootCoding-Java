package com.bootcoding.method;

public class PassingValue {
    public static void increment(int x) {
     x++;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int x=1;
        System.out.println(x);
        increment(x);

    }
}
