
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Nnumber:");
        int n = sc.nextInt();
        int arm = 0, a, b;
        b = n;
        while (n > 0) {
            a = n % 10;
            arm = (a * a * a) + arm;
            n = n / 10;
        }
        if (b == arm) {
            System.out.println("These is Armstrong Number:");
        } else {
            System.out.println("These is Not Armstrong Number:");
        }
    }
}