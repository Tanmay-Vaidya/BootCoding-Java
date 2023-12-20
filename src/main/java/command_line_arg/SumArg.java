
package command_line_arg;
public class SumArg {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        int sum=0;
        int rem=0;

        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("The given integer sum is:"+sum);
    }
}
