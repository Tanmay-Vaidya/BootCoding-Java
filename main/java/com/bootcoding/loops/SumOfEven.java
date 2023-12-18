class SumOfEven{
      public static void main(String[]args){
      int num=15;
      int esum=0;
      for(int i=1;i<=num;i++)
         {
          if(i%2==0)
          {
           esum=i+esum;
          }
         }
          System.out.println("Even number addition is:"+esum);
         }
}