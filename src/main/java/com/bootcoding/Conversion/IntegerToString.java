class IntegerToString{
     public static void main(String[]args){
     int a=1234;
     String str=Integer.toString(a);
     System.out.println(str);
     
     String str1=String.valueOf(a);
     System.out.println(str1);
     
     String str2=String.format("%d",a);
     System.out.println(str2);
     
     String str3=""+a;
     System.out.println(str3+""+str3.length());

     }
}