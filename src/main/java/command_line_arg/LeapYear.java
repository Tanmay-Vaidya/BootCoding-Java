
public class LeapYear {
    public static void main(String[] args) {


       int year = Integer.parseInt(args[0]);


        if(year%4==0)
        {
            System.out.println("It is leap year"+year);
        }
        else {
            System.out.println("It is not leap year"+year);
        }
    }
}
