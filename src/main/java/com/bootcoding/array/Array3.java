package com.bootcoding.array;
public class Array3 {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        for (int i = 0; i < 10; i++) {
            if (arr[i]>0) {
                System.out.println("This is positive number:"+arr[i]);
            } else if (arr[i]<0) {
                System.out.println("This is negative number:"+arr[i]);

            }
        }

    }
}