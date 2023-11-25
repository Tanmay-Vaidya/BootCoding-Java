package LogicalProgram;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year:");
        int num = sc.nextInt();
        if (num % 4 == 0) {
            System.out.println("It is a Leap Year");
        } else {
            System.out.println("It is not a Leap Year");
        }
    }
}

