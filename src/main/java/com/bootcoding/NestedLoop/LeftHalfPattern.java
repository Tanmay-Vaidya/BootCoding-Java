package com.bootcoding.NestedLoop;

class LeftHalfPattern{
      public static void main(String[]args){  
      int n=5;  

      for(int m= 0; m<= n; m++)  
         {  
         for(int j=1; j<=n-m; j++)  
            {  
             System.out.print(" ");  
            }  
         for(int k=0;k<=m;k++)  
            {  
             System.out.print("*");  
            }   
         System.out.println();  
         }  
     }  
}  