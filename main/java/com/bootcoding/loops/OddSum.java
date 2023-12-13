class OddSum{
      public static void main(String[]args){
      int num=15;
      int osum=0;
      for(int i=1;i<=15;i++)
         {
          if(i%2!=0)
            {
             osum=i+osum;
            }
         }
            System.out.println("Odd Number Addition is:"+osum);
         }
}