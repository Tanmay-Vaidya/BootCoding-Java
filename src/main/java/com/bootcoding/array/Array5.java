package com.bootcoding.array;
public class Array5 {
    public static void main(String[] args) {
        int age[]={20,30,60,80,};
        for(int i=0;i<4;i++)
        {
            if(age[i]==20)
            {
                System.out.println("These is younger:"+age[i]);
            } else if (age[i]==30)
            {
                System.out.println("These is younger:"+age[i]);
            } else if(age[i]==60)
            {
            System.out.println("These is old:"+age[i]);
            } else if (age[i]==80) {
                System.out.println("These is very old:"+age[i]);
            }

        }
    }
}
