import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int count=0;
        for (int i=1;i<=num;i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("These is prime Number:");
        }
        else{
            System.out.println("Thesr is not prime Number");
        }
    }
}
