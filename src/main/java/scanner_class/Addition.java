package scanner_class;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number:");
        int a=sc.nextInt();
        System.out.println("Enter a second number:");
        int b=sc.nextInt();
        int c=a+b;


        System.out.println("Addition of two number is:"+c);
    }
}