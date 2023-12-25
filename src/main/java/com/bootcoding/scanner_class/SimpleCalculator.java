package com.bootcoding.scanner_class;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {

        char operator;
        Double num1, num2, result;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = sc.nextDouble();

        System.out.println("Enter the operator: +, -, *, or / ");
        operator = sc.next().charAt(0);

        System.out.print("Enter second number:");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("result=" + (num1 + num2));
                break;

            case '-':
                result = num1 - num2;
                System.out.println("resulr=" + (num1 - num2));
                break;

            case '*':
                result = num1 * num2;
                System.out.println("result=" + (num1 * num2));
                break;

            case '/':
                result = num1 / num2;
                System.out.println("result=" + (num1 / num2));
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}

