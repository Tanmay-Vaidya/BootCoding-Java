package com.bootcoding.for_each_loop;

public class MaximumElement {
    public static void main(String[] args) {
        int numbers[] = {67,45,90,86,25};
        int maxelEment = 0;
        for (int number : numbers) {
            if (number > maxelEment) {
                maxelEment = number;
            }
        }
        System.out.println("Maximum value: " + maxelEment);
    }
}



