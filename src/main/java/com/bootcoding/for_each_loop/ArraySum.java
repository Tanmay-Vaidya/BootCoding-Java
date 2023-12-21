package com.bootcoding.for_each_loop;

public class ArraySum {
    public static void main (String [] args)
        {
            int numbers[] = {3,9,5,2,7};
            int sum = 0;

            for(int number : numbers)
            {
                sum =sum+ number;
            }
            System.out.println(" The Sum of the array is:"+ sum);
        }

}
