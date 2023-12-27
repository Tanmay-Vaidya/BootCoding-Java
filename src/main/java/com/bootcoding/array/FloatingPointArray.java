package com.bootcoding.array;
import java.util.Scanner;
public class FloatingPointArray
{

  public static float point(float a[], float n)
    {
        float product = 1;
        for (int k = 0; k < n; k++)
            product = product * a[k];
        return product;
    }
    public static void main(String[] args) {

        float [] a = {2.1f, 3.4f, 4.5f, 6.4f, 8.6f};
        float n = a.length;
        System.out.println(point(a,n));
    }
}
