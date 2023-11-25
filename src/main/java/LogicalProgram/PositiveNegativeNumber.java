package LogicalProgram;
import java.util.Scanner;
public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a=sc.nextInt();
        int i=0;
        if (i<a)
        {
            System.out.println("These is positive Number:");
        }
        else {
            System.out.println("These is Negative Number:");
        }
    }
}
