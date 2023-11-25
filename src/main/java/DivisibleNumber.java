import java.util.Scanner;
public class DivisibleNumber {
    public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);

            System.out.print("Enter a Number: ");
            int num = s.nextInt();
            int div=3;
            if(num%div==0)
                System.out.println("It is divisible by 3");
            else
                System.out.println("It is not divisible by 3");
        }
    }
