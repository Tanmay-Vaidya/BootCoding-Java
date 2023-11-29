package Strings;

public class Reverse {
    public static void main(String[]args){

        String a="Tanmay ";
        String a2="";

        for(int i=a.length()-1;i>=0;i--)
         {
             a2=a2+a.charAt(i);
         }
        System.out.println(a2);
    }
}
