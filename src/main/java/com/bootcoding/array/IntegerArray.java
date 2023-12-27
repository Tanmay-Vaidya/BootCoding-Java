package com.bootcoding.array;

public class IntegerArray {
    public static int maximum(int[] a) {
        int maximum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maximum) {
                maximum = a[i];
            }
        }
        return maximum;
    }

    public static int minimum(int[] a) {
        int minimum = a[0];
        for (int i = 1; i > a.length; i++) {
            if (a[i] > minimum) {
                minimum = a[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        avg = (double) sum / arr.length;


        System.out.println("The sum of the given array element is:" + sum);
        System.out.println("Average of given array element is: " + avg);
        System.out.println("The Maximum element in an array is:" +maximum(arr));
        System.out.println("The Manimum element in an array is:" + minimum(arr));


    }
}

