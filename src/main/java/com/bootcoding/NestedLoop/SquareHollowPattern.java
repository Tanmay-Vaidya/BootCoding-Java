package com.bootcoding.NestedLoop;

public class SquareHollowPattern {
       public static void main (String[]args){
           for(int j=1;j<=5;j++)
           {
               for(int z=1;z<=5;z++)
               {
                   if(j==1 || j==5 || z==1 || z==5)
                   {
                       System.out.print("*");
                   }
                   else{
                       System.out.print(" ");
                   }
               }
               System.out.print("\n");
           }
       }
}
