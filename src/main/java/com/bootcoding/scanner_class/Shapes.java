package com.bootcoding.scanner_class;
import java.util.Scanner;
public class Shapes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char p;
        float r, ar;
        int s, b, h;
        System.out.println("Enter c for circle" +
                "Enter s for square" +
                " Enter t for triangle:");
        p = sc.next().charAt(0);

        switch (p) {
            case 'c':
                System.out.println("Enter radius");
                r = sc.nextFloat();
                ar = 22 / 7 * r * r;
                System.out.println("Area of circle is" + ar);
                break;

            case 's':
                System.out.println("Enter side");
                s = sc.nextInt();
                ar = s * s;
                System.out.println("Area of square is" + ar);
                break;

            case 't':
                System.out.println("Enter base or height");
                b = sc.nextInt();
                h = sc.nextInt();
                ar = 1 / 2 * b * h;
                System.out.println("Area of triangle is" + ar);
                break;

            default: {
                System.out.println("Wrong input");
            }
        }
    }
}










