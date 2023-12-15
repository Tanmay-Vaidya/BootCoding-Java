class NumberIncreasingPyramid{
      public static void main(String[]args){
          int number=1;
      for(int t=0;t<=4;t++)
         {
          number=1;
          for(int k=1;k<=t;k++)
             {
              System.out.print(number+" ");
              number++;
             }
          System.out.println();
         }
      }
}
