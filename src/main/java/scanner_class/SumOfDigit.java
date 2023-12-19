package scanner_class;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int sum=0;
        int r=0;

        while (n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("The given integer sum is:"+sum);
    }
}
